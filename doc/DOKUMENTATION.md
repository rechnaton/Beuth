#Dokumentation Softwaretechnik-Projekt #peat
Beuth Hochschule für Technik Berlin, Wirtschaftsinformatik, 4. Semester, Sommersemester 2016

repetitio mater studiorum est

---

## Benchmark

https://www.supermemo.com/


---
## Theorie

### Vergessenskurve
https://de.wikipedia.org/wiki/Vergessenskurve

### Spacing Effekt
http://lexikon.stangl.eu/9382/spacing-effect-intervall-effekt/

### optimaler Wiederholungsintervall
https://en.wikipedia.org/wiki/SuperMemo#Algorithms
https://www.supermemo.com/english/algsm8.htm
https://www.supermemo.com/english/ol/sm6.htm
http://www.lac.ane.pl/pdf/5409.pdf


### Fragekategorien und Antwortformate

* Offene Fragen: freies Antwortformat
* Geschlossene Fragen: 
  * Binärfragen (Single Choice) bzw. Entscheidungsfragen: Ja/Nein
  * Multiple Choice: Select oder Check

* Wir haben uns für die Version 1.0.1 auf den Typ der geschlossenen Fragen geeinigt.

### SQLite

Wir brauchen übrigens keine JDBC-Verbindung. Es gibt direkt Bibliotheken zum Ansteuern der SQLite-DB. Eine leere DB habe ich bereits angelegt. Jetzt bin ich dabei das SQL-Skript zur Erstellung der Tabellen zu schreiben. Als nächstes kommt jetzt Daten ein- und auslesen. Das mache ich zunächst für Fragen. Dann checke ich den Code ein.

---

* Was ist der USP der App?
  * Einfaches Handling, auf die wichtigsten Funktionen reduziert.
  * Man kann sich selbst seine eigenen Fragen stellen lassen. Karteikarten sind obsolet.
  * Man kann auch Fragen-Abonnements buchen (Version 2.0).
* Geschäftsmodell: Wie soll mal Geld verdient werden?
  * App selbst kostet je Download (beginnend ab einer bestimmten Zahl an Usern).
  * Abonnements kosten je Download. Davon geht ein Teil an den Verfasser, ein anderer Teil geht an #peat.
  * Modulare Erweiterung (z.B. neue Frage-Wiederholungs-Logik) kostet je Update (Fehlerbehebungen sind kostenfrei und automatisiert).

---

## Ausblick

* Statt lokale Datenbank SQLite einen „Backend-as-a-Service“-Anbieter wie Parse: http://t3n.de/news/backend-as-a-service-parse-504596/
* via Parse ginge auch Push-Notification:
  * https://parse.com/tutorials/android-push-notifications
  * https://parse.com/apps/quickstart#parse_data/mobile/android/native/new
* Rating von Fragen / Selbstreinigung (in GUI bereits (noch ohne Funktion) integriert)
* Community: Contributors von Fragen <> Follower
* Statt lokaler DB eine Remote-DB auf einem Server
* Angebot mehrerer Fragekategorien
* Erweiterung der Funktionalitäten der EinstellungenActivity
* Webpage (u.a. zum Download der App, Speichern von Fragen/Antworten)
![PeatLanding] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/1_peatlanding.png)
![PeatSave] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/2_füllepeat.png)
![PeatFeedback] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/3_feedbackpeat.png)