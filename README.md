# test_docker
## Exemple d'application java containeurisé avec docker
Deux facons de demarrer le programme au lancement du container :
  - entrypoint : programme lancer au demarrage du conatiner
  - cmd : cmd lancer par le programme
  
 Par defaut, l'entrypoint est : /bin/sh -c 
 
 Ici on a choisit de lancer un script shell dans l'entrypoint (le script est ajouté dasn l'image : attention : dos2unix si edition sous windows)
 
 run.sh : 
 #!/bin/sh
java -jar /app.jar $1

 
