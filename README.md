# TPINTBDCHAT
Something to host my group's work for college

Notes TP2 Intergiciel et Bases de Données
Pour le chat :
Côté client et côté serveur
Le serveur a une liste des Messages postés
Message : id, auteur, date ?, contenu 

Au lancement du client, l'utilisateur doit entrer son pseudonyme.
Les messages apparaissent sous le format suivant : @pseudoAuteur : contenu
Les messages sont gardés par le serveur dans une liste ordonnée par date de post.
L'interface utilisateur affiche les 10 derniers messages et permet d'entrer un message avant de le poster.
Pour rendre le système persistant, on écrit l'historique des messages dans un fichier.
Bouton refresh ? -> appel d'une méthode du client par le serveur
Client : méthode newMessage(Message m) qui met à jour le display

Utiliser pkill rmiregistry pour libérer le port

ChatServer
List ChatClient pour pouvoir tous les contacter lorsqu'un nouveau message est posté
List Message (+ fichier source ?)

ChatClient
String pseudonyme
List Message historique

Questions pour la présentation : quelle est l'architecture ? Quelles sont les interfaces ?
