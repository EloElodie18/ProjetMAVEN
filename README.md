# ProjetMAVEN
Qu'est ce que Maven? ( centraliser, structuration d'un projet ) -->accumulateur de connaissance en hebreu

C'est un outil de gestion de projet qui aide à son organisation en Java; il fournit les moyens de construire(compiler), de déployer, et de gerer les projets de manière éfficace ds une logique de pratique de dvlpmt universel.
Il simplifie la gestion des dépendances.
Composé de plsrs élements de structure: la racine, le pom, le repertoire SRc, le repertoire TARGET(cible de ce que l'on construit).

Est intégré directement à Eclipse; il s'appel M2Eclipse.

Intervient à plsrs moment ds le processus d'un projet ce qui fait de lui un outil central.

Permet de travailler en commun, via une structure imposée

 -DEPENDANCES (class)
 
>Relations entre deux modules qui ne peuvent fonctionner l'un sans l'autre.

>Il existe des bibliothèques et des modules en open source en gnrl

>Ca devient une dépendance à partir du moment où ton projet dépend de leurs fonctionnnalités.

>L'association des dépendances se fait via le fichier POM.xml.

>Elles présentent des numéros de versions, dont la mise à jour est nécessaire pour garantir la bonne fonctionnalité du logiciel; ces dernières peuvent être auto ou demandés(eviter de le faire).

>On peut aussi les prendre hors MAVEN mais ce ne sera pas clair pour un autre user

-PLUGINS (gestion) --> JAR, ETC.

>Petit programme complementaire permettant d'ajouter des fonctionnalités.

>Maven utilise des plugins pour étendre ses fonctionnalités(ex: executer des test, compiler du code, etc.).


 
