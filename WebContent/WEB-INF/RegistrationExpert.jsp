<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Inscription Admin</title>
        <link href="dist/css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="bg-primary2">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Créer compte Expert</h3></div>
                                    <div class="card-body">
                                        <form action="RegistrationExpert" method="post">
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="prenom">Prénom</label>
                                                        <input class="form-control py-4" id="prenom" name="prenom" type="text" placeholder="Entrez votre prénom" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="nom">Nom</label>
                                                        <input class="form-control py-4" id="nom" type="text" placeholder="Entrez votre nom" />
                                                    </div>
                                                </div>
                                            </div>
                                             <div class="form-group">
                                                <label class="small mb-1" for="">Etablissement</label>
                                                <input class="form-control py-4" id="" name="email" type="text" aria-describedby="emailHelp" placeholder="Entrez votre etablissement" />
                                            </div>
                                            <div class="form-group">
									          <p> Copie du diplôme :  
										          <input type="file" name="dip" id="dip" class="form-control form-control-lg form-control-a" 
										          placeholder="Uploader l'image ou le fichier pdf de votre diplôme">
										          </p>
										      <div class="validation"></div>
										     
										    </div>
										    <div class="form-group">
									          <p> Copie de la pièce d'identité :  
										          <input type="file" name="image_mai" id="image_mai" class="form-control form-control-lg form-control-a" 
										          placeholder="Uploader l'image ou le fichier pdf de votre pièce d'identité">
										          </p>
										      <div class="validation"></div>
										     
										    </div>
                                            <div class="form-group">
                                                <label class="small mb-1" for="email">Email</label>
                                                <input class="form-control py-4" id="email" name="email" type="text" aria-describedby="emailHelp" placeholder="Entrez votre email" />
                                            </div>
                                            
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="password">Mot de passe</label>
                                                        <input class="form-control py-4" id="password" name="password" type="password" placeholder="Entrez votre mot de passe" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="onfirmPassword">Confirmer Mot de passe</label>
                                                        <input class="form-control py-4" id="ConfirmPassword" name="ConfirmPassword" type="password" placeholder="Confirmez votre mot de passe" />
                                                    </div>
                                                </div>
                                            </div>
		                                    <!-- <c:if test="${sessionScope.exist== true}"> <font
										          face="verdana"
										          color="red"> Compte qui existe déja !</font>
										          </c:if>
										           <c:if test="${!(sessionScope.confirmPwd)}"> <font
										          face="verdana"
										          color="red"> Mot de passe erroné !</font>
										          </c:if> -->
										        
                                            <div class="form-group mt-4 mb-0"><button class="btn btn-primary btn-block" type="submit">S'inscrire</button></div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center">
                                        <div class="small"><a href="ExpertLogin">Vous avez déja un compte? Allez vous connecter</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
           
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="dist/js/scripts.js"></script>
    </body>
</html>
