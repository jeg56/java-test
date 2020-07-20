# Notre projet
On veut un outil en ligne de commande qui permet de connaître la date exacte du mercredi de démarrage d'une semaine
cinéma à partir de l'année et du numéro de semaine.

## Règle n°1
Une semaine cinéma commence un mercredi et finit un mardi

## Règle n°2
Les semaines cinéma au sein d'une année sont numérotées de 1 à 52 ou 53 suivant les années

## Règle n°3
Lorsqu'une semaine cinéma est à cheval entre deux années, la semaine appartient à l'année dans laquelle tombent la
majorité de ses jours (4 ou plus). Ainsi:
* Pour une année avec un mercredi 25, 26, 27 ou 28 décembre, ce mercredi commence la dernière semaine cinéma de l'année
* Pour une année avec un mercredi 29, 30 ou 31 décembre, ce mercredi commence la première semaine cinéma de l'année
suivante

## Règle n°4
Les paramètres d'année et de numéro de semaine sont obligatoires. Tout paramètre manquant ou non conforme induit un
 erreur.