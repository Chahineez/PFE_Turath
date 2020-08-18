<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Turath</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://unpkg.com/leaflet@1.3.1/dist/leaflet.css" integrity="sha512-Rksm5RenBEKSKFjgI3a41vrjkw4EVPlJ3+OiI65vTjIdo9brlAacEuKOiQ5OFh7cOI1bkDwLqdLw3Zg0cRJAAQ==" crossorigin="" />
        <style type="text/css">
            #map{ /* la carte DOIT avoir une hauteur sinon elle n'apparaît pas */
                height:400px;
            }
        </style>

  <!-- Custom fonts for this template -->
  <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <!-- Custom styles for this template -->
  <link href="css/business-casual.min.css" rel="stylesheet">

</head>

<body>





  <!-- Navigation -->
  <%@include file="header.jsp" %>
 <br>

        
     
       <div class="col-xl-9 col-lg-10 mx-auto">
            <div class="bg-faded p-5">
              <h2 class="section-heading mb-4">
              <span class="section-heading-lower">${ mai.appels[0]} </span>
         </h2>
         <h2 class="section-heading mb-4">     
                <span class="section-heading-upper">Description</span>
              </h2>
              <img src= "${mai.images[0]}" class="float-right">
              <p>${mai.descEltPatri}</p>
              <p>  </p>
              <p>  </p>
              <p>  </p>
             <!--  <p class="mb-0">We guarantee that you will fall in <em>lust</em> with our decadent blends the moment you walk inside until you finish your last sip. Join us for your daily routine, an outing with friends, or simply just to enjoy some alone time.</p>
             -->
             
              <h2 class="section-heading mb-4">
	                <span class="section-heading-upper">Appelations</span>
	              </h2>
	               
                   <c:forEach var="appel" items="${mai.appels}">
	              <ul>
	              <li><p>${appel}</p></li>
	              </ul>
	              </c:forEach>
	              <p class="mb-0"></p>
	              
	             
               
              <h2 class="section-heading mb-4">
               
                <span class="section-heading-upper">Catégorie</span>
              </h2>
              <p>
              Cette maison est de type: Maison à west dar.
              </div>
             
            </div> 
           <div class="col-xl-9 col-lg-10 mx-auto"> 
            <div class="row">   
           <div class="col-md-6 section-md-t3" style="padding-right: 0px;">
           
            <div class="bg-faded p-5">
              <h2 class="section-heading mb-4">  
	                <span class="section-heading-upper">Historique</span>
	              </h2>
	              <p>Cette maison a été construite en: ${mai.dateConstruction} </p>
	              <!--  <p class="mb-0">La période de construction : ${mai.périodeConstruction} </p>-->
	              <p>            </p>
 <!--  --><p class="mb-0">Fondateur: Yahia Rais, officier de la marine algérienne.
                                            </p>
	            
	             </div>
	              
	           
              </div> 
            
            <div class="col-md-6 section-md-t3" style="padding-left: 0px;">
            
	              <div class="bg-faded p-5">
              <h2 class="section-heading mb-4">
                
                <span class="section-heading-upper">Les caractéristiques de la maison</span>
              </h2>
              <ul>
              <li>
              Altitude: ${mai.altitude}
              </li>
             
              <li>
              Longitude: ${mai.longitude}
              </li>
              <li>
              Surface de la maison: non renseigné ${mai.surfaceMaison}
              </li>
              <li>
              Surface du sol: non renseigné ${mai.surfaceSol}
              </li>
              </ul>
              
             </div>
            </div>
           
          </div>
       </div>
          
           <div class="col-xl-9 col-lg-10 mx-auto"> 
            <div class="row">    
              
        <div class="col-md-6 section-md-t3" style="padding-right: 0px;">
           
            
            </div>
         <div class="col-md-6 section-md-t3" style="padding-left: 0px;">
            
      </div>
      </div>
      
      <div class="bg-faded rounded p-5">
              <h2 class="section-heading mb-4">
                
                <span class="section-heading-upper">Les éléments architecturaux</span>
              </h2>
              
               <table class="table">
    <thead>
      <tr>
        <th>Elément</th>
        <th>Appellation traditionnelle</th>
        <th>Définition</th>
      </tr>
    </thead>
    <tbody>
      <tr>
      
        <td>Patio</td>
        <td>West-ed-dar  </td>
        <td> Cour intérieure à ciel ouvert autour de laquelle s’articulent les différents composants de la maison.
        </td>
      </tr>
      <tr>
        <td>Chicane</td>
        <td>Sqifa</td>
        <td>Un petit espace  d’accès intermédiaire entre le niveau de la rue et celui du wastaldar (le patio).
        </td>
      </tr>
    
      <tr>
        <td>Galerie </td>
        <td>Rwaq </td>
        <td>Une première périphérie du patio qui représente le centre de la demeure. C'est un 
espace dynamique, de forme géométrique irrégulière en général, 
        </td>
      </tr>
     
    </tbody>
  </table>
         <a class="nav-link" href="ListeEltArchi">Voir plus</a>
              </div>
            
            <div class="bg-faded rounded p-5">
              <h2 class="section-heading mb-4">
                
                <span class="section-heading-upper">Autres photos</span>
              </h2>
              
				<div id="demo" class="carousel slide" data-ride="carousel" style="padding-right: 0px;padding-top: 0px;padding-bottom: 0px;width: 400;padding-left: 260px;">
					  <ul class="carousel-indicators">
					    <li data-target="#demo" data-slide-to="0" class="active"></li>
					    <li data-target="#demo" data-slide-to="1"></li>
					    <li data-target="#demo" data-slide-to="2"></li>
					  </ul>
					  <div class="carousel-inner">
					            
                   <c:forEach var="image" items="${mai.images}">
					    <div class="carousel-item active">
					      <img src="${image}" alt="Los Angeles" width="300" height="200">
					      <div class="carousel-caption">
					        
					      </div>   
					    </div>
					   </c:forEach>
					  </div>
					  <a class="carousel-control-prev" href="#demo" data-slide="prev">
					    <span class="carousel-control-prev-icon"></span>
					  </a>
					  <a class="carousel-control-next" href="#demo" data-slide="next">
					    <span class="carousel-control-next-icon"></span>
					  </a>
					</div>
              
             </div>
       <div class="bg-faded rounded p-5">
              <h2 class="section-heading mb-4">
                
                <span class="section-heading-upper">Les références:</span>
              </h2>
              <ul>
               <li ><a style="color:blue" href="<c:url value="http://cnra.dz/atlas" />" alt="" >
               www.cnra.dz/atlas
              </a></li>
              <li> PPSMVSS de la Casbah d’Alger 
(Manuel des  typologies architecturales, 
constructives et architectoniques)  
              </li>
              <li>Mémoire de magister « Evaluation de la qualité environnementale dans le secteur sauvegardé. Cas d'études "la casbah d'Alger" », Djamel Merrad, 2012</li>
              </ul>
              <c:if test="${!empty sessionScope.prenomNom}"> 
	              <div class="row">
	              <div class="col">  </div>
	               <div class="col"></div>
	             
		                  <div class="col"> 
		               <a href="ModifierMaison?id_mai=${mai.idEltPatri}"  class="btn btn-primary btn-xl"  role="button">Modifier</a>
		                    <a href="SupprimerMaison?id_mai=${mai.idEltPatri}"  class="btn btn-primary btn-xl"  role="button" 
		                onclick="return confirm('Etes vous sùr de vouloir supprimer cette maison?');">Supprimer</a>
		               </div>
		             
	   
	              </div>
              </c:if>
              </div>

           </div>        
  <br>

<%@include file="footer.jsp" %>
 

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
   <script src="https://unpkg.com/leaflet@1.3.1/dist/leaflet.js" integrity="sha512-/Nsx9X4HebavoBvEBuyp3I7od5tA0UzAxs+j83KgC8PU0kgB4XiK4Lfe4y4cgBtaRJQEIFCW+oC506aPT2L1zw==" crossorigin=""></script>


</body>

</html>
    