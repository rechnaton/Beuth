#Protokolle

#16.04.2016

- Expose (Andreas, Thomas)
- Fragenkatalog (Thomas)
- Use Cases Beispiele (Thomas)
- Deployment (Thomas)
- Architekturbild (Komponenten- und Paketdiagramm, welche Komponenten sollen die GUIs haben?) (Thomas)
- Explorative GUI (Bsp. Push Notification, App (Landing, Settings), Web => Lumzi) (Andreas)

Thomas Ricklinkat:
- UML-Diagramme modellieren (Use Cases, Paket-, Klassen-, Deployment- und Komponentendiagramm)

Andreas Mosig:
- GUIs entwerfen

------------------------------------------------------------------------------------------

#23.04.2016 (Präsenz)

Entwicklung
QM
Wartung Pflege
?

Nicht zu viel Frameworks/Tools
Nicht zu viel GUI

Ruby on Rails (Sinatra)

MET Metriken, 
CCD Clean Code Developement/Developer (Grade)
BUI Buildmanagement
CID Continious Integration/Delivery

Fragen:
1) Web und App, oder entweder oder? - App, lokale DB, 
2) Empfehlung für App-Frameworks/Entwicklung? - Eclipse, Plugins, SQLlite
3) Versionierung, wie? - releases (git)
4) Webserver / Webservice? - nein

Ideen:
1) lokale Datenbank (Abo)
2) Synchronisation mit Web-DB (User kann neues Thema zum Abo hinzufügen)
3) Statusbericht in asana als Terminserie mit Links zu easyBacklog
4) In easyBacklog:
4.1) Thema (z.B. App, Weboberfläche, DB)
4.2) Story (z.B. UI, Funktion A/B, Farbe, ..)
4.3) Sprint (z.B. Version 1, Verions 2, ..)
5) In asana dann die Sprints grob anlegen und managen
6) Ausblick auf Webserver/-service, Abos, Jeder
7) Lernintervalle in DB hinterlegen (Wiederholung)

Tasks (bis 01.05.2016)
- Fachwissen aneignen und in Doku notieren (alle)
- Use Cases (Expose) prüfen (alle)
- und diese als Stories in easyBacklog eingeben (Thomas)
- Sprints planen (alle)
- DB-Schema (ER)(Steven)
- Doku parallel pflegen (Andreas)
- Prototyp weiterentwickeln (nach jedem Sprint neue, lauffähige Version > releases in git) (alle)

------------------------------------------------------------------------------------------

#01.05.2016 (Online Meeting via Team Viewer)

- Fehler/Kompilierfehler mit Studio bei Steven (Theme.AppCompat.Light-Library)
- Thomas testet am selben Abend (01.05.2016) noch SDK und AVD und gibt Steven Bescheid, ob dieselben Fehler auftreten > wenn nicht, arbeitet Steven via Eclipse (+SDK, AVD)
- Steven muss noch Pullrequest ziehen (Datensatz nicht aktuell)
- Steven hat DB DesignerFork erstes Shema gemacht
 mit den wichtigsten Attributen (erklärt es)

- WIEDERHOLUNGSLOGIK: Nutzer > alle 5 Min > Frage richtig > isIgnore false, lastShown Date, isLastAnswerCorrect true > nächste Frage ... > falsch beantwortete Fragen wiederholt (sortiert nach lastShown) > User kann bereits richtig beantwortete Fragen ignorieren (isIgnore true) > bis alle Fragen richtig gewesen sind > und keine Fragen mehr, die User noch nicht gesehen hat (lastShown) > Report / Statistik

Tasks:

Alle (04.05.2016):
- Java-Version (master) 1.8.0_91 (prüfen)
- Libraries prüfen > Build / Run as Android Application
- alle aktuell, alle haben ausführbaren Code

Steven (13.05.2016):
- Steven lädt DB-Schema-XML-Datei hoch und ergänzt in Dokumentation (bis 04.05.2016)
- DB-SQLite-Schema erstellen
- Prototyp der DB erstellen
- wie in Android-Projekt hinein?
- Testdatensatz erzeugen

Andreas (13.05.2016):
- wichtigste Dateien / Ordner zusammentragen > online stellen bzw. in peat-Slack-Kanal
- GUI erweitern Logik: Frage steht, Ja / Nein-Radio-Buttons (Variablen true/false)

Thomas (13.05.2016):
- GUI erweitern (Themenauswahl, Frage stellen; PeatUser_has_Themes)

Ausblick:
- Fragetypen (Multiple Choice, Offene Fragen)
- Neuanlage von Fragen
- Wiederholung > länger werdende Zeiträume
- Spacing Effekt
- Rating der User/Contributer/Fragen > Statistiken/Sperre, User-Community

------------------------------------------------------------------------------------------

#08.05.2016 (Online Meeting via Team Viewer)

Startschwierigkeiten :)

Rückblick:
- Andreas hat einige Buttons/Funktionen (siehe GitHub) hinzugefügt.
- Thomas hat das Projekt implementiert und lauffähig gemacht.
- Steven hat sich weiter hinsichtlich der Datenbank informiert und diese erweitert/vorbereitet.

Tasks:

Alle:
- Jeder zieht sich noch einmal den aktuellen Stand nach dem heutigen Meeting
- Sprints werden ggf. nachträglich dokumentarisch erfasst
- weitere Dokumentation erfolgt nach Fortschritt mit DB (-Anbindung)

Steven:
- wird das Projekt noch einmal in Eclipse aufbauen, statt Android Studio zu nutzen
- DB ist bis 15.05. aufgesetzt

Andreas:
- committed letzten Stand der Entwicklung
- Wie funktioniert Datenbankanbindung (theoretische Vorbereitung)?

Thomas:
- GUI erweitern (Themenauswahl, Frage stellen; PeatUser_has_Themes (siehe database https://github.com/andreasmosig/peat/tree/master/doc/DB)

------------------------------------------------------------------------------------------

#16.05.2016 (Online Meeting via Team Viewer)
21 Uhr

- inkl. Feedback an Prof. Edlich
