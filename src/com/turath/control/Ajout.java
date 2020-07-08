package com.turath.control;

import java.util.List;

import org.apache.jena.query.Dataset;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;

import com.turath.model.*;

public class Ajout {
	
	public Ajout() {}
	
	/***********Ajouter une fonction à un elt Archi **********/
	public boolean add_fonction_a_elt_archi (Fonction fonction, Dataset dataset, int idEltArchi)
	{
		int idFonction = fonction.getIdFonction();
		String fct = fonction.getFonction();
		String typeAspect = fonction.getTypeFonction();
		
		String addFonction="prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
		             +"prefix rdfs:	  <http://www.w3.org/2000/01/rdf-schema#>"
				     +"prefix mysdb:  <http://www.w3.org/ontologies/patriArchi#> "
	    +"INSERT DATA"
		+"{ graph <http://www.w3.org/ontologies/patriArchi> {"

		+" mysdb:Fonction"+idFonction+" mysdb:idFonction "+idFonction+";"
		+"				 mysdb:fonction \""+fct+"\";"
		+"               mysdb:typeAspect \""+typeAspect+"\"."
		+" mysdb:Fonction"+idFonction+" mysdb:AssureeParEA mysdb:EltArchi"+idEltArchi+"."
	    +" mysdb:EltArchi"+idEltArchi+" mysdb:AssurerEA mysdb:Fonction"+idFonction+"."
		+" mysdb:Fonction"+idFonction+" rdf:type mysdb:FonctionEltArchi."
		+" mysdb:FonctionEltArchi a rdfs:Class."
		+ "}"
		+"}";		
		try {		  
        	 UpdateRequest update  = UpdateFactory.create(addFonction);
		     UpdateProcessor qexec = UpdateExecutionFactory.create(update, dataset);
		     qexec.execute();
		    }
	    catch(Exception e){ 
	    	 System.out.println(e.getMessage());
	    	 return false;}
		     return true;		
	}
	/*************Ajouter Relation entre fonction et elt archi*****/
	public boolean add_relation_fct_elt_archi(int idEltArchi, int idFonction, Dataset dataset)
	{	
		String addRel="prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
		             +"prefix rdfs:	  <http://www.w3.org/2000/01/rdf-schema#>"
				     +"prefix mysdb:  <http://www.w3.org/ontologies/patriArchi#> "
	    +"INSERT DATA"
		+"{ graph <http://www.w3.org/ontologies/patriArchi> {"
		+" mysdb:Fonction"+idFonction+" mysdb:AssureeParEA mysdb:EltArchi"+idEltArchi+"."
	    +" mysdb:EltArchi"+idEltArchi+" mysdb:AssurerEA mysdb:Fonction"+idFonction+"."
		+ "}"
		+"}";		
		try {		  
        	 UpdateRequest update  = UpdateFactory.create(addRel);
		     UpdateProcessor qexec = UpdateExecutionFactory.create(update, dataset);
		     qexec.execute();
		    }
	    catch(Exception e){ 
	    	 System.out.println(e.getMessage());
	    	 return false;}
		     return true;		
	}
/****************Ajouter plusieurs fonctions à elt_archi***********/
	
	public boolean add_fonctions_a_elt_archi (List<Fonction> fonctions, Dataset dataset, int idEltArchi)
	{
		 for (int i=0; i< fonctions.size(); i++)
			{
				/****Vérifier si la fct n'existe pas *****/
			    Recherche rech =new Recherche();
			    Fonction fct =rech.rechFctParNom(fonctions.get(i).getFonction(), dataset);
				if (fct ==null)
				{
					boolean added = add_fonction_a_elt_archi(fonctions.get(i), dataset, idEltArchi);
					if (added == false ) 
					{
						System.out.println("Erreur lors de l'ajout d'une fonction");
						return false;
					}					
				}
				else
				{
					boolean rel = add_relation_fct_elt_archi(idEltArchi,fct.getIdFonction(),dataset);
					if (rel==false)
					{
						System.out.println("Erreur lors de l'ajout d'une relation entre une fonction et un elt archi");
						return false;
					}
				}
			}
		  return true;
	}
	/***********Ajouter une image à un elt Archi*********/
	public boolean add_image_a_elt_archi (Image  image, Dataset dataset, int idEltArchi)
	{
		int idImage = image.getIdImage();
		String img = image.getImage();
		String legende = image.getLegende();
		
		String addImage="prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
		             +"prefix rdfs:	  <http://www.w3.org/2000/01/rdf-schema#>"
				     +"prefix mysdb:  <http://www.w3.org/ontologies/patriArchi#> "
	    +"INSERT DATA"
		+"{ graph <http://www.w3.org/ontologies/patriArchi> {"
		+" mysdb:Image"+idImage+" mysdb:idIllustration "+idImage+";"
		+"				 mysdb:illustration \""+img+"\";"
		+"               mysdb:legende \""+legende+"\"."
		+" mysdb:Image"+idImage+" mysdb:IllustrerEA mysdb:EltArchi"+idEltArchi+"."
	    +" mysdb:EltArchi"+idEltArchi+" mysdb:IllustreParEA mysdb:Image"+idImage+"."
		+" mysdb:Image"+idImage+" rdf:type mysdb:Illustration."
		+" mysdb:Illustration a rdfs:Class."
		+ "}"
		+"}";		
		try {		  
        	 UpdateRequest update  = UpdateFactory.create(addImage);
		     UpdateProcessor qexec = UpdateExecutionFactory.create(update, dataset);
		     qexec.execute();
		    }
	    catch(Exception e){ 
	    	 System.out.println(e.getMessage());
	    	 return false;}
		     return true;		
	}
	
/****************Ajouter plusieurs fonctions à elt_archi***********/
	
	public boolean add_images_a_elt_archi (List<Image> images, Dataset dataset, int idEltArchi)
	{
		
		 for (int i=0; i< images.size(); i++)
			{

					boolean added = add_image_a_elt_archi(images.get(i), dataset, idEltArchi);
					if (added == false ) 
					{
						System.out.println("Erreur lors de l'ajout d'une image");
						return false;
					}		
			}
		return true;
	}
	
	/***********Ajouter une source à elt archi*********/
	public boolean add_source_a_elt_archi (Source source, Dataset dataset, int idEltArchi)
	{
		int idSource = source.getIdSource();
		String src = source.getSource();
		String typeSource = source.getTypeSource();
		
		String addSource="prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
		             +"prefix rdfs:	  <http://www.w3.org/2000/01/rdf-schema#>"
				     +"prefix mysdb:  <http://www.w3.org/ontologies/patriArchi#> "
	    +"INSERT DATA"
		+"{ graph <http://www.w3.org/ontologies/patriArchi> {"
		+" mysdb:Source"+idSource+" mysdb:idSource "+idSource+";"
		+"				            mysdb:source \""+src+"\";"
		+"                          mysdb:typeSource \""+typeSource+"\"."
		+" mysdb:Source"+idSource+" mysdb:ContenirSEA mysdb:EltArchi"+idEltArchi+"."
	    +" mysdb:EltArchi"+idEltArchi+" mysdb:RetireDeEA mysdb:Source"+idSource+"."
		+" mysdb:Source"+idSource+" rdf:type mysdb:Source."
		+" mysdb:Source a rdfs:Class."
		+ "}"
		+"}";		
		try {		  
        	 UpdateRequest update  = UpdateFactory.create(addSource);
		     UpdateProcessor qexec = UpdateExecutionFactory.create(update, dataset);
		     qexec.execute();
		    }
	    catch(Exception e){ 
	    	 System.out.println(e.getMessage());
	    	 return false;}
		     return true;		
	}
/**************Ajouter Relation entre source et elt_archi*****************/
	public boolean add_relation_src_elt_archi (int idSource, int idEltArchi,Dataset dataset)
	{
		String addRel="prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
		             +"prefix rdfs:	  <http://www.w3.org/2000/01/rdf-schema#>"
				     +"prefix mysdb:  <http://www.w3.org/ontologies/patriArchi#> "
	    +"INSERT DATA"
		+"{ graph <http://www.w3.org/ontologies/patriArchi> {"
		+" mysdb:Source"+idSource+" mysdb:ContenirSEA mysdb:EltArchi"+idEltArchi+"."
	    +" mysdb:EltArchi"+idEltArchi+" mysdb:RetireDeEA mysdb:Source"+idSource+"."
		+ "}"
		+"}";		
		try {		  
        	 UpdateRequest update  = UpdateFactory.create(addRel);
		     UpdateProcessor qexec = UpdateExecutionFactory.create(update, dataset);
		     qexec.execute();
		    }
	    catch(Exception e){ 
	    	 System.out.println(e.getMessage());
	    	 return false;}
		     return true;		
	}
/****************Ajouter plusieurs sources à elt_archi***********/
	
	public boolean add_sources_a_elt_archi (List<Source> sources, Dataset dataset, int idEltArchi)
	{
		 for (int i=0; i< sources.size(); i++)
			{
			 
				/****Vérifier si la src n'existe pas *****/
			    Recherche rech= new Recherche();
			    Source src = rech.rechSrcParNom(sources.get(i).getSource(), dataset);
				if (src == null)
				{
					boolean added = add_source_a_elt_archi(sources.get(i), dataset, idEltArchi);
					if (added == false ) 
					{
						System.out.println("Erreur lors de l'ajout d'une source");
						return false;
					}			
				}
				else
				{
					boolean rel = add_relation_src_elt_archi(src.getIdSource(),idEltArchi,dataset);
					if (rel==false)
					{
						System.out.println("Erreur lors de l'ajout d'une relation entre une source et un elt archi");
						return false;
					}
				}
			}
		  return true;
	}
	
	
	
	
	
	
	
	
	
	
	/**********AJOUTER UN ELEMENT ARCHITECTURAL***********/
	
	public Boolean add_elt_archi_sdb( EltArchi eltArchi, Dataset dataset)
	{
		Recherche rech = new Recherche();
		EltArchi elt= rech.rechEltArchiParNom(eltArchi.getNomEltArchi(), dataset);
		if (elt!= null) return true;
		else {
		int idEltArchi = eltArchi.getIdEltArchi();
		String nomEltArchi = eltArchi.getNomEltArchi();
		String descEltArchi = eltArchi.getDescEltArchi();
		String appelTradi = eltArchi.getAppelTradi();
		String typeEltArchi = eltArchi.getTypeEltArchi();
		List<Fonction> fonctions = eltArchi.getFonctions();
		List<Source> sources = eltArchi.getSources();
		List<Image> images = eltArchi.getImages();
		
		String addEltArchi="prefix rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
	             +"prefix rdfs:	  <http://www.w3.org/2000/01/rdf-schema#>"
			     +"prefix mysdb:  <http://www.w3.org/ontologies/patriArchi#> "
			     +"INSERT DATA"
			     +"{ graph <http://www.w3.org/ontologies/patriArchi> {"
			     +" mysdb:EltArchi"+idEltArchi+" mysdb:idEltArchi "+idEltArchi+";"
			     +"				          mysdb:nomEltArchi \""+nomEltArchi+"\";"
			     +"                       mysdb:appelTradi \""+appelTradi+"\";"
			     +"                       mysdb:descEltArchi \""+descEltArchi+"\";"
			     +"                       mysdb:typeEltArchi \""+typeEltArchi+"\"."
			     +" mysdb:EltArchi"+idEltArchi+"  rdf:type mysdb:EltArchi."
			     +" mysdb:EltArchi a rdfs:Class."
			     + "}"
			     +"}";
		
		Boolean continu = true;
		try {		  
       	 UpdateRequest update  = UpdateFactory.create(addEltArchi);
		 UpdateProcessor qexec = UpdateExecutionFactory.create(update, dataset);
		 qexec.execute();
		 System.out.println("EltArchi ajouté sans Listes");
		    }
	    catch(Exception e){ 
	    	 System.out.println(e.getMessage());
	    	 continu= false;}
        if (continu==true) 
        {
        	continu = add_fonctions_a_elt_archi(fonctions,dataset,idEltArchi);
        	if (continu ==true) 
        	{
        		System.out.println("Fonctions ajoutées avec succés");
        		continu = add_images_a_elt_archi(images,dataset,idEltArchi);
        		if (continu ==true)
        		{
        			System.out.println("Images ajoutées avec succés");
        			continu= add_sources_a_elt_archi(sources,dataset,idEltArchi);
        			if (continu== true)
        			{
        				System.out.println("Sources ajoutées avec succés");
        			}
        		}
        		else return continu;	
        	}
        	else return continu;
        	
        }
        return continu;
		}
	}
	
	


	/********Ajouter appellation type Maison****/
	/********Ajouter un type de Maisons********/
	/********Ajouter relation entre type maison et maison**********/
	
	/********Ajouter une maison**************/
	
	


}
