<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ taglib tagdir="/tags" prefix="mesTags"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<div class="container-fluid bg-primary text-white footer mt-5 pt-5 wow fadeIn" data-wow-delay="0.1s">
            <div class="container py-5 px-lg-5">
                <div class="row gy-5 gx-4 pt-5">
                    <div class="col-12">
                        <h5 class="fw-bold text-white mb-4">Abonnez vous</h5>
                        <div class="position-relative" style="max-width: 400px;">
                        	<form action="SendMail" method="POST">
                            	<input class="form-control bg-white border-0 w-100 py-3 ps-4 pe-5" type="text" name="email" placeholder="Entrez votre email">
                            	<button class="btn btn-primary py-2 px-3 position-absolute top-0 end-0 mt-2 me-2">Envoyer</button>
                        		<!-- <button class="btn btn-primary w-100 py-2">Envoyez</button> -->
                        	</form>
                        </div>
                    </div>
                    <div class="col-lg-5 col-md-12">
                        <div class="row gy-5 g-4">
                            <div class="col-md-6">
                                <h5 class="fw-bold text-white mb-4">Qui sommes-nous ?</h5>
                                <a class="btn btn-link" href="">A propos</a>
                                <a class="btn btn-link" href="">Nos Contact</a>
                                <a class="btn btn-link" href="">Vie Privée</a>                       
                                <a class="btn btn-link" href="">Support</a>
                            </div>
                            <div class="col-md-6">
                                <h5 class="fw-bold text-white mb-4">Nos Services</h5>
                                <a class="btn btn-link" href="">Formations</a>
                                <a class="btn btn-link" href="">Conseils</a>
                                <a class="btn btn-link" href="">Interventions</a>
                                <a class="btn btn-link" href="">Cours à domicile</a>
                                <!-- <a class="btn btn-link" href="">Reseller Hosting</a> -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <h5 class="fw-bold text-white mb-4">Adresse</h5>
                        <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>Marck, France, Europe</p>
                        <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+33 x xx xx xx xx</p>
                        <p class="mb-2"><i class="fa fa-envelope me-3"></i>informatik@gmx.fr</p>
                        <div class="d-flex pt-2">
                            <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-youtube"></i></a>
                            <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-linkedin-in"></i></a>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-4 mt-lg-n5">
                        <div class="bg-light rounded" style="padding: 30px;">
                        		<h3>Je donne mon avis</h3>
                        	<form action="AddMessageSimple" method="POST">
                            <input type="text" name="nom" class="form-control border-0 py-2 mb-2" placeholder="Nom">
                            <input type="text" name="prenom" class="form-control border-0 py-2 mb-2" placeholder="Prénom">
                            <input type="email" name="email" class="form-control border-0 py-2 mb-2" placeholder="Email">
                            <textarea name="messageText" class="form-control border-0 mb-2" rows="2" placeholder="Tapez votre message ici"></textarea>
                            <button class="btn btn-primary w-100 py-2">Envoyez votre message</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container px-lg-5">
                <div class="copyright">
                    <div class="row">
                        <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                            &copy; <a class="border-bottom" href="#">yao-kouassi.info</a>, Tous droits reservés. 
														
							Devéloppé par <a class="border-bottom" href="#">KY</a>
                            </br>
                            Distribué par <a class="border-bottom" href="#" target="_blank">Bozi.France</a>
                        </div>
                        <div class="col-md-6 text-center text-md-end">
                            <!-- <mesTags:footer-menu></mesTags:footer-menu> -->
                            <div class="footer-menu">
                                <a href="<c:url value="Accueil" />">Accueil</a>
                                <a href="<c:url value="Accueil" />">Cookies</a>
                                <a href="<c:url value="Accueil" />">Aide</a>
                                <a href="<c:url value="Accueil" />">FQAs</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>