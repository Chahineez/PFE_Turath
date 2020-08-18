<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier Elément</title>
</head>
<body>
<%@include file="header.jsp" %>
  <br>
  <br>
<div class="container"> 

       <div class="col-xl-9 col-lg-10 mx-auto">
	  	<form class=" form-a"  method="post" action="ajoutMai" enctype="multipart/form-data" >
  	
  		<div class="bg-faded p-5">
  
      	<p class="h5 mb-6">Modifier une maison traditionnelle :</p><br>
      <div class="form-row mb-4">
      
       <div class="form-group">
      <div class="col-lg-30">
            <p >Le nom de la maison:
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom de la maison" value="Dar El Bekri" name="nom_mai" id="nom_mai">
          </p>
        </div>


<div id="autre_nom" class="col-lg-30">
<p >Le deuxième nom de la maison:
<input type="text" class="form-control form-control-lg form-control-a" placeholder="Le deuxième nom de la maison" value="Dar Khedaoudj El Amia" name="nom_deux_mai" id="nom_deux_mai">
 </p>
</div>      

             <p >La description de la maison:
              <input class="form-control" name="description_mai"  id="description_mai" 
              data-rule="required"  value="Dar Khedaoudj El Amia se situe au niveau du quartier Souk-el-Djemâa, bordant la rue Mohamed Malek. Authentique palais construit en 1570 par Yahia Rais « officier de la flotte Algérienne » Propriété de la fille du Dey, elle fut occupée par le trésorier du Dey Med Ben Athmane, elle fut ensuite, la 1ere mairie Française d’Alger, en 1909, elle devient l’hôtel particulier du premier président de la cour d’appel.En1947 elle est aménagée en maison d’artisanat. Classée en 1887, elle abrite actuellement le musée des arts et traditions populaires depuis 1987. Elle a subi des travaux de réhabilitation après 2003."
              placeholder="Description de la maison"/>
              </p>
              
              <p >Le type de la maison:
              <select class="form-control form-control-lg form-control-a" name="type_mai" id="type_mai">
                  <option value="1">Maison à West Eddar</option>
                  <option value="2">Maison Alawi</option>
                  <option value="3">Maison à Chbek</option>
              </select>
              </p>
              
            
                 
           <div class="row">
            <p> Altitude:
            <input type="text" class="form-control form-control-lg form-control-a" value="36.78669" placeholder="Altitude"  name="altitude_mai" id="altitude_mai">
            </p>
            <p> Longitude:
            <input type="text" class="form-control form-control-lg form-control-a" value="3.06103" placeholder="Longitude"  name="longitude_mai" id="longitude_mai">
            </p>
            </div>
       
           <div class="row">
             <p> Date de la construction :
            <input type="text" class="form-control form-control-lg form-control-a" value="1570" placeholder="Date de la construction"  name="date_const_mai" id="date_const_mai">
            </p>
            <p> Période de la construction :
            <input type="text" class="form-control form-control-lg form-control-a" value="" placeholder="Période de la construction"  name="période_const_mai" id="période_const_mai">
            </p>
         </div>
         
          <div class="row">
             <p> Surface du sol :
            <input type="text" class="form-control form-control-lg form-control-a"  value="" placeholder="Surface du sol"  name="surface_sol" id="surface_sol">
            </p>
            <p> Surface de la maison :
            <input type="text" class="form-control form-control-lg form-control-a"  value="" placeholder="Surface de la maison"  name="surface_mai" id="surface_mai">
            </p>
         </div>
         
         <div class="form-group">
          <p> Image de la maison :  
	          <input type="file" name="image_mai" id="image_mai" class="form-control form-control-lg form-control-a" 
	          placeholder="Uploader l'image de la maison">
	          </p>
	          <div class="validation"></div>
	     
	    </div>
	    
         
          </div>
           </div>
 
 
        <div id="buttonSubmit" class="col center">
                <button type="submit" class="btn btn-success">Valider</button>
                   
    </div>
  	</form>
</div>
</div>

<br>
<%@include file="footer.jsp" %>
<!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script>
 function handleNom(checkbox){
	 if (checkbox.checked==true){
		 document.getElementById("autre_nom").style.visibility="visible";
	 }else{
		 document.getElementById("autre_nom").style.visibility="hidden";
	 }
 }

 
</script>
</body>
</html>
