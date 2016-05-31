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

#10.05.2016 (Online Meeting komplette Gruppe)

Andreas:
- den aktuellen Prototyp von #peat in die Dropbox legen und Link an Herrn Prof. Edlich senden: https://www.dropbox.com/sh/8djn2di76w9jqga/AABS1uvujSAhcy7iVWHPvo9oa?dl=0 - done

Tasks:
- zum nächsten Online Meeting mit allen am 24.05.2016 einen Prototyp präösentieren

------------------------------------------------------------------------------------------

#17.05.2016 (Online Meeting via Moodle)
21 Uhr
Teilnehmer: Andreas, Thomas

- verschoben vom 16.05.2016
- Protokoll, Tasks und Statusbericht aktualisieren
- Prüfungsterminwunsch verabschieden: 08.07.2016 um 12:30 Uhr (ist noch frei)

Rückblick:
- Versionen v1.0.0-0008 bis v1.0.0-0010 (siehe https://github.com/andreasmosig/peat/releases)
- Andreas postet Tutorials zu SQLite in Slack #peat, onClickNoSound hinzugefügt, Fragen-Array und Merged Pull Requests und löst Konflikte
- Steven schreibt die Klassen PeatDbHelper.java und PeatDataSource.java und Question.java
- Thomas schreibt user_themes.xml, eine neue Activity ging leider verloren
- Thomas Lösung der Fehlermeldung *This version of the rendering library is more recent than your version of ADT plug-in. Please update ADT plug-in*: Android SDK öffnen > Android 5.1.1 (API22) installieren (ohne Images) > Eclipse neu starten > xml editieren > rechts oben im XML-Fenster beim grünen Roboter auf Version 5.1.1 umstellen > fertig
- Lösung weiterer Fehlermeldung *The following classes could not be found: android.support.v7.internal.app.WindowDecorActionBar (Fix Build Path, Edit XML, Create Class)*: in res/values-v14/styles.xml Base.Theme.AppCompat.Light.DarkActionBar statt Theme.AppCompat.Light.DarkActionBar

Tasks

Andreas:
- Release v1.0.0-0011 erstellen

Thomas:
- Feedback an Herrn Prof. Edlich senden
- inkl. Prüfungsterminwunsch
- weiter an der neuen Activity zur PeatUser_has_Themes-Tabelle arbeiten

Ausblick:
- zeitnahen, internen Termin (außerordentlich) finden
- Zielversion v2.0.0-0001: Datenbankanbindung ersetzt das Mockup-Fragen-Array
- Organisatorisches: Asana, easyBacklog, etc
- Prototyp für den 24.05.2016 zum Gruppenmeeting vorbereiten

------------------------------------------------------------------------------------------

#21.05.2016 (Meeting nach der Präsenz)
15:30 Uhr - ca. 16:30 Uhr
Teilnehmer: Andreas, Thomas, Steven

Ergebnisse:
- zeitnahen, internen Termin (außerordentlich) finden > hiermit erledigt
- Fehlersuche für App-Absturz mittels Try-Catch erfolglos, weil Stack zu diesem Zeitpunkt nicht nachvollziehbar
- Einigung auf die Umsetzung des Single-Choice Fragetypen für den Prototypen zur Präsentation am 24.05.2016

Tasks:

Andreas:
- Exception-Handler intergrieren um Fehlermeldung analysieren zu können
- .gitignore um bin/ und gen/ ergänzen (Herrn Edlichs Vorschlag umsetzen)
- Button "Close" durch Button "Menü" ersetzen

Steven:
- Datenbank-Fehlersuche

Thomas:
- GUI inkl. Datenbankanbindung für Single-Choice-Fragetyp

Alle:
- Kurz-Meeting unmittelbar vor der Präsentation am 24.05.2016 zwecks Absprache Schwerpunkte der Präsentation

------------------------------------------------------------------------------------------

#24.05.2016 (Online Meeting komplette Gruppe)

Ergebnisse:
- Prototyp nicht ganz fertig geworden: keine Datenbankanbindung
- Präsentation der App per ADK-Emulator durch Andreas
- Hinweis Herr Edlich:
-- weitere Fragetypen mit einplanen --> war für Enddokumentation für den Ausblick bereits vorgesehen
-- USP und Geschäftsmodell herausarbeiten

Andreas:
- Under-Construction-Activity für die Fragetypen, die noch nicht umgesetzt sind erstellen

Thomas:
- notieren der Hinweise von Herrn edlich in Enddokumentation

------------------------------------------------------------------------------------------

#31.05.2016 (Online Meeting via Moodle)
21 Uhr
Teilnehmer: Andreas, Thomas

- Protokoll, Tasks und Statusbericht aktualisieren
- weiteres Vorgehen besprechen
- Prüfungsterminwunsch nachfragen, da Zusage für 08.07.2016 um 12:30 Uhr, in Moodle jedoch jetzt Tagliatelle vermerkt statt #peat
