
#Dokumentation Lernapp #peat

Erlerntes spielend wiederholen und nie wieder vergessen!


![peat](https://github.com/andreasmosig/peat/blob/master/res/drawable-hdpi/ic_launcher.png)



###Version: v1.0.1-0000

###Ausgabe: 1

###Autoren/Entwickler:
###Steven Pawelleck, Thomas Ricklinkat, Andreas Mosig

###Kontakt: mailtopeat@gmail.com

###Stand: 03.07.2016


###Beuth Hochschule für Technik Berlin, Wirtschaftsinformatik, 4. ###Semester, Sommersemester 2016



#Gliederung

#1. Einleitung

##1.1. Problemstellung und Zielsetzung der Arbeit (fertig | Andi)

##1.2. Projekt-Stammdaten (fertig | Andi)

##1.3. Projektidee, -ziel und -plan (fertig | Thomas)

#2. Vorbetrachtungen (IST-Analyse)

##2.1. Theoretische Aspekte einer Lernsoftware (fertig | Thomas)

##2.2. Vision und Geschäftsmodell (fertig | Thomas)

##2.3. Marktanalyse (fertig | Thomas)

#3. Produktdefinition und Systementwurf (SOLL-Konzept)

##3.1. Vorgehensweise (fertig | Thomas)

##3.2. Requirements (fertig | Thomas, Andi)

##3.3. Design und Architektur (fertig | Andi)

##3.4. Konzept der Qualitätssicherung (fast fertig | Thomas, Andi, Steven)

#4. Umsetzung

##4.1. Plattform (Thomas, Andi, Steven)

##4.2. GUI (Thomas, Andi)

###4.2.1. Screenshots je Activity

###4.2.2. Methoden

##4.3. Logik (Thomas, Andi, Steven)

##4.4. Persistenz (Steven, Andi)

##4.5. Versionierung (fertig | Andi)

#5. Schlussbetrachtung

##5.1. Zusammenfassung (Thomas, Andi, Steven)

##5.2. Erkenntnisse (fertig | Andi)

##5.3. Ausblick (fertig | Andi)

#6. Weiterführende Links

#7. Glossar


Legende zur Formatierung:

# = 1. Ebene

## = 2. Ebene

### = 3. Ebene

--- = Trennlinie

* = Aufzählung

![Name](bild.png) = Bild einbinden

**wort** = Formatierung bold

#1. Einleitung

##1.1. Problemstellung und Zielsetzung der Arbeit (fertig | Andi)

Das **Lerngebiet** des Softwareentwicklungsprojektes erstreckt sich über viele Aspekte der Softwaretechnik, d.h. u.a. in der praktischen Anwendung von Modellierungsprachen (wie z.B. [UML](https://de.wikipedia.org/wiki/Unified_Modeling_Language) sowie von Vorgehensmodellen der Softwareentwicklung (z.B. [SCRUM](https://de.wikipedia.org/wiki/Scrum).


Das übergeordnete **Lernziel** ist, aus den in der Theorie erworbenen Inhalten, die individuellen sowie gruppenspezifischen Kompetenzen herauszubilden resp. zu verstärken. Diese sind u.a. die Fähigkeit zur selbständigen Bearbeitung einer Aufgabenstellung, die Anforderungsanalyse sowie die Modellierung prozessorientierter Systeme. Darüber hinaus lassen sich weitere Ziele nennen, wie ganz trivial die Realisierung in einer Gruppe, die daraus resultierende Forderung und Förderung der Teamfähigkeit und schließlich das Einüben systematischer Vorgehensweisen und Arbeitstechniken auf wissenschaftlicher Basis. Selbstverständlich sollen auch die Arbeitsergebnisse in Form einer lauffähigen Anwendung sowie der hier vorliegenden Dokumentation präsentiert werden.


Das konkrete **Projektziel** ist das Entwickeln einer Implementierungsidee für ein (virtuelles) Start-UP, hin zu einem lauffähigen Prototypen. Dieser soll dem Auftraggeber, welcher sich als [Business Angel](https://de.wikipedia.org/wiki/Business_Angel) (BA) versteht, präsentiert werden, um seine finanzielle Beteiligung an dem Projekt in Höhe von 300.000 EUR zu erwirken. Während des Entwicklungsprozesses sollte des Weiteren eine ausführliche Dokumentation erstellt werden, die Ihnen hiermit vorliegt. Neben der Projektdokumentation lag der Fokus auf dem Kodieren (Applikation, Interfaces) und einer gesunden Gruppendynamik.


Das **Team #peat** bestand zu Beginn, d.h. in der Findungsphase einer Vision, noch aus zwei Mitgliedern. Schnell wurde klar, dass die gestellten Anforderungen an das Projekt noch eine weitere Kraft erfordern würden. Im Zuge der finalen Festlegung der Idee sowie der Gruppe, galt es die nächsten Ziele und Meilensteine zu definieren. Ein [Exposé](https://github.com/andreasmosig/peat/blob/master/doc/EXPOSE.md) sollte die ersten Weichen stellen. Hierin wurden Anforderungen, theoretische Grundlagen, technische Aspekte, wie z.B. Architektur und Entwicklungsumgebung sowie Meilensteine abgesteckt.


Die **Statusberichte** wurden alle ein bis zwei Wochen per E-Mail an den BA samt der Verlinkungen zu den in der Folge dieser Arbeit vorgestellten Projektmanagement- sowie Versionenverwaltungs-Anwendungen geschickt (s. [6.](#6. Weiterführende Links)).

##1.2. Projekt-Stammdaten (fertig | Andi)

###a) Gruppenmitglieder

* Thomas Ricklinkat (s58372@beuth-hochschule.de, Matr.-Nr. 821644)

* Andreas Mosig (s58395@beuth-hochschule.de, Matr.-Nr. 817272)

* Steven Pawellek (s45848@beuth-hochschule.de, Matr.-Nr. 776340)


###b) Projektdauer

* Der Projektzeitraum erstreckte sich vom 7. April (Kick-Off) bis zum 8. Juli 2016, dem Tag der Präsentation der Arbeitsergebnisse.


###c) Projektmanagement-Werkzeuge

* Für den allgemeinen Austauch und für die Projekt- sowie interne Kommunikation mit dem BA und allen Kommilitonen, wurde eine allgemein zugängliche [Slack-Gruppe](http://beuthswtprojekt.slack.com) vom BA eingerichtet. Darüber hinaus verfügte jede Projektgruppe über  ihren eigenen, projektinternen Slack-Kanal. Für das vorliegende Projekt war es der Kanal **peat**.


* Das Projektmanagement fand via [asana.com](https://app.asana.com/0/105766113985042/105766113985043) statt, welches synchron mit dem Projekt-Slack-Kanal verbunden war. Jegliche asana-Kommunikation war und ist im Slack-Kanal nachvollziehbar (s. [5.2.](##5.2. Erkenntnisse)).


* Für die [agile Software-Entwicklung](https://de.wikipedia.org/wiki/Agile_Softwareentwicklung) mit Scrum war ursprünglich das Arbeiten mit dem Tool easyBacklog vorgesehen (s. [5.2.](##5.2. Erkenntnisse)).


* Das Versionsmanagement erfolgte via GitHub ([Master-Branch](https://github.com/andreasmosig/peat)). Analog zu asana liefen alle Aktivitäten im privaten Slack-Kanal zusammen und waren für den BA einsehbar.


###d) Entwicklungswerkzeuge

* Für die verschiedenen Komponenten und Schnittstellen sind unterschiedliche Technologien und Werkzeuge notwendig gewesen. Zum Entwickeln der Android-App in Java wurde Eclipse sowie dafür notwendige Plugins (SDK/AVD, JUnit, etc.) verwendet.


* Für die Erstellung des konzeptuellen und logischen Datenbankschemas wurde der DBDesignerFork verwendet und daraus das entsprechende MySQL-DDL-Skript erzeugt und als Klasse in Eclipse eingebunden, da in der Entwicklungsumgebung bereits Bibliotheken zum Ansteuern der SQLite-DB vorhanden gewesen sind.


* Sonstige Tools waren Modellierungsprogramme, wie ArgoUML und UMLet, welche der theoretischen Konzeption der UML-Diagramme dienten (u.a. Use Cases, Paket-, Klassen-, Deployment- und Komponentendiagramm). Die Versionierung erfolgte über git, wie z.B. GitHub.

##1.3. Projektidee, -ziel und -plan (fertig | Thomas)

Die **Implementierungsidee** für das (virtuelle) Start-Up #peat entstand aus einem studentischen Grundbedürfnis (Lernen) sowie der Erfahrung heraus, gefestigtes Wissen länger zu behalten, als ungefestigtes Wissen. Daher lag es nahe, eine Anwendungssoftware zu entwickeln, die Lerninteressierte dabei unterstützt, erlerntes Wissen durch Wiederholung in **Frageform** zu festigen und damit den Lernerfolg langfristig zu maximieren.


Bei der Namensfindung für die Lernapplikation (Lernapp) spielten folgende Überlegungen eine Rolle:


* “peat” stammt aus dem englischen Verb “repeat” (engl. wiederholen)

* ein menschlich klingender Name soll ganz allgemein die Einstellung zum Lernen sowie die Kommunikation bzgl. der Applikation positiv stärken: #peat als dein Freund

* Hashtag # zur Optimierung des Namens aus Online-Marketingsicht


Für den späteren wirtschaftlichen Erfolg der Lernapp im Allgemeinen sowie für eine erfolgreiche Unternehmenskommunikation im Speziellen, z.B. in einem App-Store, ist es u.a. wichtig, einen einprägsamen **Claim** bzw. **Slogan** zu haben. Für #peat ist das


*Erlerntes spielend wiederholen und nie wieder vergessen!*


Eine **Kurzbeschreibung** zur knappen und marktgerechten Erläuterung der Anwendungsfunktionalitäten, z.B. für einen Appstore oder einen [SEO](https://de.wikipedia.org/wiki/Suchmaschinenoptimierung)-relevanten Text auf der Website, könnte wie folgt aussehen:


> #peat hilft dir, dein erworbenes Wissen durch intelligente Wiederholung zu verfestigen und damit ins Langzeitgedächtnis zu überführen. Und das funktioniert so: hinterlege in deinem Account offene oder geschlossene Fragen zu verschiedenen Themenbereichen sowie deren Antwortmöglichkeiten und sage #peat, wann bzw. wie häufig dich #peat abfragen soll. Fertig. #peat fragt dich ab sofort bequem per Push-Notification oder per Lernquizz auf deinem Smartphone ab und du kannst die Frage direkt beantworten oder ignorieren. Am Ende des Tages kannst du dir deinen Lernerfolg darstellen lassen. Re #peat!


Wie in Punkt 1.1 bereits erwähnt, war das vorrangige **Projektziel** das Entwickeln einer Implementierungsidee hin zu einem lauffähigen, präsentierbaren Prototypen innerhalb von knapp 3 Monaten. Vor diesem Hintergrund war es daher zunächst erforderlich, das Gesamtziel in Teilziele zu zerlegen und dabei jeweils zu unterscheiden, was davon realistisch gesehen in dieser Zeit umgesetzt werden kann bzw. was davon in den Ausblick genommen werden muss. Der folgende Milestone-Plan zeigt das Ergebnis dieser Überlegungen, wobei die einzelnen Meilensteine in Anlehnung an die Scrum-Methode als “Sprints” bezeichnet werden:


* Sprint 0) Semesterstart (29.03.2016)

* Sprint 1) Projekt-KickOff E-Mail durch den BA (07.04.2016)

* Sprint 2) UML-Diagramme, Architekturbild, GUI-Entwurf (18.04.2016)

* Sprint 3) Abgabe Exposé (18.04.2016)

* Sprint 4) Freigabe des Exposés/Projekts durch den BA (23.04.2016)

* Sprint 5) Product Backlog in easyBacklog anlegen (01.05.2016)

* Sprint 6) Einrichten der Entwicklungsumgebung (04.05.2016)

* Sprint 7) Erstellung des Datenbankschemas (08.05.2016)

* Sprint 8) erster, versionierter, explorativer Prototyp ohne Persistenz (23./24.04.2016)

* Sprint 9) Implementierung der Datenbank im Android-Projekt (13.05.2016)

* Sprint 10) Demonstration eines ersten Prototypen und Versionierung (25.05.2016)

* Sprint 11) Lesen aus Datenbank: Wiederholungslogik in Form eines Quizz-Spiels (Datum)

* Sprint 12) Eingabe für neue Ja-Nein-Frage speichern (19.06.2016)

* Sprint 13) gespeicherte Frage Lesen und im Quizz darstellen (Datum)

* Sprint 14) Quizz vor und zurück gehen ohne Fehler (Datum)

* Sprint 15) Erzeugung des Abgabe-Prototypen inkl. Tests (Datum)

* Sprint 16) Fertigstellung der Enddokumentation (03.07.2016)

* Sprint 17) Vorbereitung Präsentation (08.07.2016)

* Sprint 18) Abgabe und Präsentation (08.07.2016)


Neben den inhaltlichen Aufgaben gehörte die **Projektkommunikation** mit dem BA als projektbezogene Aufgabe mit zu den Anforderungen: Während der gesamten Laufzeit des Projektes sollte es mit dem BA einen regelmäßigen (mind. 1-2 Wochen) Austausch in Form eines [Protokolls](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md) sowie eines [Statusberichtes](https://github.com/andreasmosig/peat/blob/master/doc/STATUSBERICHTE.md) geben.

#2. Vorbetrachtungen (IST-Analyse)

##2.1. Theoretische Aspekte einer Lernsoftware (fertig | Thomas)

Für den Entwurf des Datenbankschemas sowie die Modellierung der Wiederholungslogik war es zunächst wichtig, sich in einem angemessenen Umfang mit dem Sachgebiet vertraut zu machen und die folgenden zentralen Fragen zu beantworten:


* Welche Fragekategorien gibt es, welchen Einfluss haben diese auf die Lernapplikation und welche sind tatsächlich relevant?

* Welchen Einfluss haben Wiederholungsrate und -reihenfolge auf den Lernerfolg?


Die Implementierungsidee zu #peat stützt sich im Allgemeinen auf die [Wiederholung als Lernmethode](https://de.wikipedia.org/wiki/Wiederholung_%28Lernmethode%29), die sich der [Fragetechnik](https://de.m.wikipedia.org/wiki/Fragetechnik) bedient. Die Kernfunktionalität von #peat umfasst daher alle relevanten **Fragekategorien** und die dazugehörigen Antwortformate. In formaler Hinsicht werden die folgenden Fragekategorien unterschieden:[^fußnote1]

[fußnote1]: Vgl. https://de.wikipedia.org/wiki/Fragetechnik#Fragekategorien und https://de.wikipedia.org/wiki/Multiple_Choice#Unterschiedliche_Formate_und_Begrifflichkeiten


* Offene Fragen (freies Antwortformat)

* Geschlossene Fragen:

  * Binär-/Entscheidungs-/Ja/Nein-Fragen (eine von zwei dichotomen Antworten trifft zu: wahr/falsch, ja/nein …)

  * Single Choice (eine von n Antworten trifft zu)

  * Multiple Choice: Select (eine bekannte Anzahl von n Antworten trifft zu)

  * Multiple Choice: Check (eine unbekannte Anzahl von n Antworten trifft zu)


Für #peat sind alle genannten Fragekategorien theoretisch wichtig und relevant, realistischerweise jedoch im Rahmen dieses Projektes nicht abschließend umsetzbar. Für das Prototyping musste diese Menge daher eingeschränkt werden und die Wahl fiel ganz im agilen Sinne auf die Fragekategorie mit der geringsten Komplexität, den Ja/Nein-Fragen. Der offene Fragetyp war nicht die erste Wahl, da die softwareseitige Eigenbewertung der Antwort für einen ersten Prototypen zu komplex und nebensächlich ist.


Hinsichtlich des optimalen **Wiederholungsintervalls** gibt die [Vergessenskurve](https://de.wikipedia.org/wiki/Vergessenskurve) erste wichtige Anhaltspunkte für die spätere Modellierung des Wiederholungsalgorithmus, denn sie veranschaulicht den Grad des Vergessens im Zeitverlauf. Aus ihr lässt sich aufgrund zahlreicher wissenschaftlicher Studien ableiten, dass durch Wiederholung des Lernstoffes, der Grad des Vergessens verringert werden kann, wobei der Abstand der Zeitpunkte der Wiederholung einen relevanten Einfluss hat. Der sogenannte Spacingeffekt besagt, dass Wissen besser erinnert wird, wenn zwischen der Erstaufnahme und der ersten bzw. den folgenden Wiederholung(en) ein größerer Zeitraum liegt.[^fußnote2] In der Literatur zu Lernmethoden finden sich diesbezüglich u.a. konkrete Empfehlungen: “Weitere Repetitionen sollen nach 24 Stunden, einer Woche, einem Monat, einem halben Jahr erfolgen.”[^fußnote3]


[fußnote2]: Vgl. http://lexikon.stangl.eu/9382/spacing-effect-intervall-effekt/

[fußnote3]: Vgl. https://www.uni-due.de/edit/selbstmanagement/content/content_k6_2.html)


Diese Empfehlungen sind für ein erstes Prototyping bzw. für den Anfang sehr praktisch und lassen sich direkt in einen Wiederholungsalgorithmus übertragen. Eine Vielzahl an Forschungsergebnissen auf diesem Gebiet legt jedoch eine differenziertere Betrachtung nahe; nicht zuletzt mit Blick auf die späteren USP der Anwendung.[^fußnote4] Daneben finden sich auch Informationen zu konkreten, frei verfügbaren Algorithmen[^fußnote5], die jedoch den zeitlichen Rahmen dieses Projektes sprengen würden und damit in den Ausblick gehören.


[fußnote4]: Vgl. https://en.wikipedia.org/wiki/SuperMemo#Algorithms

[fußnote5]: Vgl. https://www.supermemo.com/english/algsm11.htm, https://www.supermemo.com/english/algsm8.htm, https://www.supermemo.com/english/ol/sm6.htm, http://www.lac.ane.pl/pdf/5409.pdf

##2.2. Vision und Geschäftsmodell (fertig | Thomas)

Die **Vision** zu #peat ist, das geliebte Lerntool schlechthin für Wissbegierige zu sein.


#peat soll nicht nur eine Plattform sein, auf der die User ihre persönlichen Wissensgebiete vertiefen, sondern auch mit anderen Usern teilen oder von professionellen Wissensträgern erwerben können. Thematisch soll #peat universal angelegt sein und bis auf wenige Ausnahmen (z.B. Gewalt) kein Fachgebiet auslassen.


Der Schlüssel, die Vision zur Realität werden zu lassen, liegt dabei in deutlich wahrnehmbaren und für den Markt relevanten bzw. treffenden **USP**. Diese könnten sein:


* #peat ist einfach: #peat ist auf die wichtigsten Funktionen reduziert, getreu dem Motto “Keep learning simple”.

* #peat ist individuell: frag dich selbst mit deinen eigenen Worten. Der Wiederholungsalgorithmus lernt mit und passt sich deinen Lernbedürfnissen an.

* #peat ist riesig und vielfältig:

  * alle Wissensgebiete sind zugänglich. Karteikarten sind obsolet.

  * Community: jeder Teilnehmer kann seine eigenen Themen mit allen anderen teilen

* #peat ist effektiv und effizient: der Wiederholungsalgorithmus basiert auf wissenschaftlichen Untersuchungen und optimiert den Lernprozess

* #peat ist überall: als mobile App und für Desktop ist #peat immer dabei


Die für den Erfolg notwendigen Investitionen bedürfen eines tragfähigen **Geschäftsmodells**, um die Existenz auch langfristig zu sichern. Die zentrale Frage dabei ist “Wie soll mal Geld verdient werden?”. Wie ein Blick auf die Startup-Szene zeigt, sind Geschäftsmodelle durchaus keine starren Gebilde [(Beispiel)](http://www.gruenderszene.de/allgemein/book-a-tiger-festangestellte-reinigungskraefte), sondern können abgewandelt, erweitert oder angepasst werden. Folgende Ideensammlung kommt für eine spätere Auswahl in Frage:


* Free: werbefinanzierte Einnahmen

* Freemium:

 * eine funktionsarme (z.B. nicht alle Frageformate stehen zur Verfügung) Gratis-Version für alle sowie eine Vollversion gegen Bezahlung

  * denkbar ist auch eine modulare Erweiterung (z.B. neue Frage-Wiederholungs-Logik), die je Update kostet

* Bezahl-App: jeder Download kostet (beginnend ab einer bestimmten Zahl an Usern)

* Marktplatzmodell (In-App-Kauf): Wissensträger können Inhalte in Form von Paketen oder Abonnements bereitstellen, z.B. Wissensgebiet “UML”. Diese Pakete bzw. Abonnements kosten je Download. Davon geht ein Teil an #peat, der Rest an den Verfasser.

 ##2.3. Marktanalyse (fertig | Thomas)

Da der Projektfokus auf dem Programmieren lag, geht es bei der Marktanalyse eher um eine grobe Einordnung der Implementierungsidee in den Markt der Anwendungssoftware.


Thematisch bewegt sich #peat auf dem Markt der Bildungsanwendungen, der mit knapp 10% Anteil an allen verfügbaren Apps im Appstore, das [drittstärkste Segment](http://de.statista.com/statistik/daten/studie/166976/umfrage/beliebteste-kategorien-im-app-store/) darstellt. Da das Segment Bildung noch zu allgemein gefasst ist, muss weiter eingegrenzt werden. Nach Auffassung der Autoren ist #peat den elektronischen Karteikarten / Lernkarten zuzuordnen, die auch das Segment der elektronischen Vokabeltrainer mit einschließen.


In diesem Bereich gab es in den Appstores von Apple und Google zum Zeitpunkt des Projektes bereits zahlreiche Anwendungen: eine Suche am 25.06.2016 nach “Karteikarten” ergab im iTunes App Store ca. 17 Apps für Karteikarten und im Google Play Store mehr als 20 Apps (Vokabeltrainer wurden nichtberücksichtigt). Für eine echte Software-Entwicklung wäre eine genauere Analyse der einzelnen Anwendungen und deren Funktionalitäten erforderlich. An dieser Stelle sollen jedoch die ersten [Hinweise](http://www.studis-online.de/Studieren/studi-apps.php) der Google-Suche bzw. von digitalen [Ratgebern](https://allmaxx.de/magazin-uniglobale/studieren/unsere-10-besten-apps-zum-lernen) ausreichen, nach der folgende Anwendungen am bekanntesten / beliebtesten sind:


* [Flashcards Deluxe](http://orangeorapple.com/)

* [BRAINYOO](http://www.brainyoo.de/)

* [AnkiDroid Karteikarten](https://ankidroid.org)


Die Hürden für einen erfolgreichen Einstieg in diesen Markt liegen durch die hohe Zahl der Anbieter bereits etwas höher. Jedoch scheinen sich die aktuellen Angebote auf den ersten Blick an Endverbraucher zu richten (B2C). Ggf. ist die Entwicklung eines B2B-Modells eine aussichtsreiche Überlegung.

#3. Produktdefinition und Systementwurf (SOLL-Konzept)

##3.1. Vorgehensweise (fertig | Thomas)

Die Systementwicklung fand entsprechend der Projektgröße agil statt und sollte nach Vorgabe durch den Auftraggeber (BA) der SCRUM-Methode folgen. Die in der Theorie eindeutig verteilten Rollen des Product Owners, des Scrum Masters, des Teams und ggf. weiterer externer Rollen war im Rahmen dieses Projektes nicht immer eindeutig bestimmt. Es kam vor, dass alle Teilnehmer sporadisch in die Rolle des Product Owners geschlüpft sind oder jedes Teammitglied spontan in die Rolle des Scrum Masters gewechselt ist. Zu allen Zeitpunkten gab es jedoch immer den Product Owner und das Team.


Der Entwicklungsprozess zu #peat richtete sich nach dem Scrum-Prozess:


* Vision: die Vision stimmt mit der Implementierungsidee überein und markierte den Beginn der Lernapp #peat

* Product Backlog: als Product Backlog verstehen sich Teile des Exposés, insbesondere die in UML modellierten Anwendungsfälle

* Sprint Planning: die 1-2 wöchentlichen Online-Meetings dienten u.a. der Planung, Schätzung und Bewertung der einzelnen Backlogs. Auf dieser Basis wurden dann die notwendigen Schritte im Hinblick auf das Projektziel erörtert. Die Ziele dieser Teilschritte sind mit den Sprintzielen identisch. Das Sprint Planning lässt sich anhand des [Protokolls](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md) nachvollziehen.

* Selected Product Backlog & Sprint Backlog: die im Sprint Planning definierten Teilschritte enthielten jeweils die notwendig umzusetzenden Aufgaben (Backlogs)

* Sprint: die Sprints an sich hatten einen 1-2 wöchentlichen Rhythmus

* New Functionality: jeder Sprint enthielt jeweils eine in sich geschlossene Funktionalität, die dann zum nächsten Treffen präsentierbar sein sollte (usable Software)

* Retrospective: insbesondere die Zusammenkünfte zu den Präsenzen dienten der taktischen/strategischen Rückschau. Kleinere Rückschauen gab es zu den 1-2 wöchentlichen Online-Meetings.


In der ursprünglichen Planung sollte der SCRUM-Prozess durch das Tool easyBacklog unterstützt werden. Das wurde zu Beginn des Projektes auch versucht, stellte sich jedoch schnell für das Projekt als zu umständlich heraus. Die weitreichenden Funktionen von easyBacklog eignen sich besser für größere Projekte und ein mit easyBacklog immer aktuell gepflegtes Backlog hätte in diesem Projekt eher ein ressourcenbindenden Dokumentationscharakter gehabt. Daher wurde für den weiteren Verlauf auf dieses Tool verzichtet.


![Auszug aus dem easyBacklog](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/auszug-easyBacklog.png)

##3.2. Requirements (fertig | Thomas, Andi)

Im Rahmen des **Requirements Engineering** geht es im Allgemeinen um die Frage, welche Anforderungen an das zu erstellende Softwaresystem existieren. Da diese Anforderungserhebung immer im Zusammenhang mit bestimmten Personengruppen steht, ist es erforderlich sich mit den (Ziel-)Gruppen bzw. Stakeholdern auseinanderzusetzen, an die #peat sich richtet bzw. die von #peat in irgendeiner Form betroffen sind.


Auf Basis dieser Überlegungen haben sich diverse technische Fragen ergeben, die es im Zuge der Entwicklung zu beantworten galt.


Für #peat stehen vor allem folgende Stakeholder bzw. Anspruchsgruppen im Fokus:


* Benutzer,

* Investoren,

* Geschäftspartner (Kollegen, Lieferanten),

* Öffentlichkeit und

* Staat,


wobei im Rahmen des Projektes ausschließlich die späteren Benutzer betrachtet wurden.


Das Volere Requirements Specification Template empfiehlt an dieser Stelle eine ausführliche Beschreibung der einzelnen Stakeholder inklusive fiktiver Persona-Profile und Gewichtungen, was jedoch den Rahmen dieser Arbeit überschritten hätte.


Um dem elementaren Charakter der Anforderungen gerecht zu werden, war geplant, die Anforderungen wie folgt zu managen:


* Dokumentation von Anwendungsfällen in Form eines Use-Case-Diagramms

* anschließende Konkretisierung der Requirements mit Hilfe des Tools easyBacklog im Rahmen der Product-Backlog-Erstellung


Wie bereits im Punkt 3.1 erwähnt, wurde die Arbeit mit easyBacklog aufgegeben, so dass nur das Exposé-Use-Case-Diagramm existiert und damit dieser Punkt etwas zu kurz kam.


![visionäres Use-Case-Diagramm zu #peat](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-use-case.png)



Mit Blick auf das Projektziel (ausführbarer Prototyp) war es notwendig, diese sehr weit gefassten Anwendungsfälle auf ein realistisches Maß zu reduzieren. Die nachfolgenden, ausschließlich funktionalen Anforderungen stellen das Ergebnis dieser Eingrenzung dar und bilden die Basis für die vom Prototypen zu erfüllenden Funktionalitäten. Die Schlüsselwörter "MUSS", "SOLL" und "KANN" sind dabei entsprechend der Definition im RFC 2119 zu interpretieren; Muss (Pflicht), Soll (Wunsch), Wird (Absicht) und Kann (Vorschlag).


###Prototyp:

* Muss I: Frage und Antwort speichern für Choice (Ja/Nein) - GUI und Datenbank

* Muss II: Antwort (true, false) aus DB lesen und per Weiter-Button ausgeben - GUI und Datenbank

* Muss III: Je Antwort-Wert (Boolean) aus DB wird entsprechend der gespeicherten Antwort ein Sound wiedergegeben - Sound und Datenbank

* Muss IV: getLastQuestion (back-Button soll die vorherige Frage anzeigen) - GUI und Datenbank


###Ausblick:

* Soll I: getLastQuestion (back-Button zeigt die nicht/falsch-beantwortete Frage erneut)

* Soll II: Vorgehen am Ende des Fragelaufs (Score oder Start von Beginn an)

* Soll III: Wiederholungslogik (nach letzter gespeicherter Frage falsch beantworteten Fragen wiederholen)


* Wird I: Webbasierte Desktop-Version

* Wird II: Alle Fragetyp-Varianten in allen Activities berücksichtigen (generischer Code)


* Kann I: Userverwaltung, Standarduser BENUTZER#1, andere Benutzer eingeben

* Kann II: Abspeichern Fragethema, anderes Thema durch Benutzer auswählen

* Kann III: Eigenständige Verwaltung der Wiederholungslogik durch den Benutzer (settings)


Nichtfunktionale Kriterien wurden im Rahmen dieses Projektes nicht berücksichtigt und werden im Ausblick kurz angerissen.

##3.3. Design und Architektur (fertig | Andi)

In der Analysephase galt es zunächst herauszufinden, aus welchen Komponenten das System bestehen würde und welche (nicht-) funktionalen Anforderungen die Komponenten erfüllen sollen. Wie in dem vorangegangenen Kapitel zu lesen ist, hat man sich auf bestimmte Grade der Verbindlichkeit hins. der zu erfüllenden Kriterien der Lernapp konzentriert. In einem derart agilen Projekt ist es wichtig, einen Schwerpunkt zu setzen.


In den initialen Überlegungen, welche sich in diversen Entwürfen wiederspiegeln ([Web-GUI](https://github.com/andreasmosig/peat/tree/master/doc/MOCKUPS/WEB)), ist zunächst der Weg erkennbar gewesen, dass es zwei Benutzeroberflächen geben würde (Web, App), die auf eine gemeinsame, auf einem Webserver installierte Datenbank (z.B. LAMP) zugreifen sollten. Dabei sollte die Web-GUI zum Erfassen und Lesen von Daten dienen (Schreib-, Lesezugriff per Benutzerkonto), die App-GUI hingegen das Lesen der Daten sowie das Konfigurieren der Wiederholungslogik zulassen.


Der Ergebnisfokus für diese Projektarbeit lag jedoch auf der Entwicklung der App und demnach mündeten die Analyse und das daraus resultierende theoretische Konzept im Laufe eines iterativen Prozesses in dem Design respektive in der Entwicklung der App-UI. Mit der Version **v1.0.1** wurde schließlich die App-Benutzeroberfläche fertiggestellt. 


###Design

Unter (Software-)Design versteht man grob den Prozess zwischen Anforderungsanalyse und der Implementierung.


Aufbauend auf den mehr oder weniger konkreten Vorstellungen hinsichtlich der zu entwickelnden App, wurde im Anschluss an das RE die grundlegende Architektur definiert, zunächst nur wenige Komponenten (i.e. Android-Activities) spezifiziert und die wichtigsten Interaktionen transparent gemacht. Das Design ist auch in dem vorliegenden Projekt die Grundlage für den Beginn der konkreten Implementierung der theoretischen und praktischen Aspekte der Lernapp gewesen.


Die Designphase schloss sich (wie in der Theorie empfohlen) an die Analysephase an, weshalb ein Kern an Anwendungsfällen bezogen auf den Funktionsumfang der App bereits definiert wurde. In easyBacklog wurden, wie bereits eingangs beschrieben, zunächst die wichtigsten Use Cases mit Rollen, Ereignissen und Ergebnissen dokumentiert und schließlich in aus der Entwicklungsarbeit resultierenden Protokollen und fortlaufend aktualisierten Task-Aufstellungen aktualisiert. Man sollte zum Start einen möglichst guten Überblick haben, d.h. funktionale Anforderungen sollten bekannt sein (z.B. das Speichern und Lesen von Fragen und Antworten in die/aus der Datenbank) als auch nicht-funktionale Anforderungen (z.B. Usability der UI). Es fiel früh auf, dass man nicht alles vorher festlegen kann und ebenso, dass zu viele verschiedene Werkzeuge das Hauptaugenmerk, nämlich die Entwicklung/Programmierung, verwischen. Die Ersten Entwürfe, die mittels [Lumzy](www.lumzy.com) angefertigt worden sind, zeigten schon früh die Anforderungen an die zu entwickelnde Lernapp #peat:


####a) App (für Version **v1.0.1**):

![Push] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/pushnotification.png)

![FrageJaNein] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/janeinfrage.png)

![Multiple] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/multiplechoice.png)

![Antwort] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/antwort.png)

![Einstellungen] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/einstellungen.png)

####b) Web (für Version **v2.0.1**):

![Landing] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/landing.png)

![Konfiguration] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/konfiguration.png)


Es stellte sich früh heraus, dass bei agilen Methoden der Softwareentwicklung die Herangehensweise an das Design bzw. die Architektur eine grundlegend andere ist, als bei den klassischen Vorgehensweisen, wie dem Wasserfallmodell, bei denen auf eine lange Analyse- eine ebenfalls lange Designphase folgt. Aufgrund der zeitlichen Einschränkung und des geplanten Vorhabens, wurde auch bei dem Softwareprojekt #peat direkt mit einem Prototyp begonnen, der die grundlegende Architektur enthielt. Dies war möglich, da die installierten Eclipse-Plugins bereits das nachfolgend etwas näher beschriebene Model View ModelView- Architekturmuster mitlieferten (AVD/-SDK-Manager, XML- und Java-spezifische Bibliotheken, SQLite, etc.). Es wurden zu Beginn nur wenige Komponenten spezifiziert, wie bspw. die splash-Seite (inkl. Musik), die MainActivity mit dem Quiz sowie grundlengende Einstellungen und die [CI](https://de.wikipedia.org/wiki/Corporate_Identity) der App. D.h. der erste [Spike](https://de.wikipedia.org/wiki/Prototyping_(Softwareentwicklung)#Vertikales_Prototyping_.28Durchstich.29) repräsentierte bereits einen kleinen Ausschnitt aus dem Design der finalen App. Daraus konnte geschlossen werden, wo die Reise hingehen wird und welche Anforderungen initial nicht berücksichtigt wurden. In der Folge konnten Schwächen relativ früh aufgedeckt werden, unterstützt durch eine stetige Qualitätssicherung (Debuggen, Tests, ExceptionHandler, s. [3.4.](##3.4. Konzept der Qualitätssicherung)). Der jeweils nächste Meilenstein konnte den Designbereich stetig iterativ erweitern und optimieren.


In dieser Phase wurden nach und nach die Komponenten (i.e. Activities, XML-Sheets und Java-Klassen/-Methoden, Android-Manifest) definiert und gestaltet. Daraus entwickelte sich die finale Struktur und Architektur. Hinzu kam die Logik und Persistenz der Datenbank.


###Architektur

Bei dem vorliegenden System #peat handelt es sich um eine Client-Server-Architektur, mit Thin Client (Webbrowser, Version **v2.0.1**) und einem Rich Client (Android App, **v1.0.1**). Um die Systemarchitektur abzubilden, wurden zu Beginn sowohl ein Komponenten- als auch ein Deploymentdiagramm erstellt:

* Deployment-Diagramm:

![deployment](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-deployment.png)

* Paket-Diagramm:

![package](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-package.png)

* Komponenten-Diagramm:

![component](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-component.png)

Daraus ergab sich eine typische Mehrschichtenarchitektur (N-Tier) mit User Interface (UI), Logiken und Persistenz/Datenbank.


Die Verwendung einer Android-Plattform als Basis der App-Entwicklung gab quasi die [Architektur](https://de.wikipedia.org/wiki/Model_View_ViewModel) bereits vor ![MVVM-Konzept](https://github.com/andreasmosig/peat/blob/master/doc/MIS/MVVM-Konzept.png)

Abbildung: Die Datenbindung (Data Binding) ermöglicht eine Trennung von der View (z. B. XAML-Markup oder HTML) und dem Model für die Darstellung.


Das Model View ViewModel (MVVM) ist ein Entwurfsmuster. Es dient zur Trennung von Darstellung und Logik der Benutzerschnittstelle (UI). Gegenüber dem MVC-Muster (Model-View-Controller) kann die Testbarkeit verbessert und der Implementierungsaufwand reduziert werden, da keine separaten Controller-Instanzen erforderlich sind.


Die drei Komponenten sind:

* Model: Datenzugriffsschicht für die Inhalte, enthält die gesamte Geschäftslogik

* View: durch grafische Benutzeroberfläche (GUI) angezeigte Elemente, austauschbar

* ViewModel: UI-Logik (Model der View), Bindeglied, ruft Methoden oder Dienste auf



Dieses Muster erlaubte eine gewisse Trennung der Rollen im Projektteam. Es gab UI-Designer (A. Mosig, T. Ricklinkat) und Entwickler (T. Ricklinkat, S. Pawelleck). Die Designer (v.a. A. Mosig) konnten ihren Fokus auf die sogenannte [User Experience](https://de.wikipedia.org/wiki/User_Experience) setzen und die Entwickler die UI- (v.a. T. Ricklinkat) sowie Datenbank-Logik (v.a. S. Pawelleck) schreiben. Daraus formte sich in effizienter Arbeitsteilung die lauffähige Anwendung #peat.

##3.4. Konzept der Qualitätssicherung (fast fertig | Thomas, Andi, Steven)

Da der Projektfokus auf dem Programmieren lag, geht es in diesem Punkt weniger um die Prozessqualität als vielmehr um die Qualität der Software an sich. Das Hauptinstrument zur Sicherstellung und Erhöhung der Softwarequalität sind Softwaretests, also automatische oder manuelle Verfahren zur Verifikation und Validierung von Software.


Für #peat kamen in Anbetracht der Zeit insbesondere folgende Tests in Frage:


* Funktionale Tests bzw. Akzeptanztests: rückblickend waren manuelle Funktionstests die häufigsten Tests

* Unit-Tests: Assertions wären gut geeignet

* Grenzwert-Tests:  um das Funktionieren der Datenbank sicherzustellen, sollten Extremwerte genutzt werden

* Installationstests: höchste Androidversion um möglichst viele Geräte abzudecken?


Im Allgemeinen sollte die Programmierung folgenden Mindeststandards genügen:


* Kommentare: jede sinnhaft zusammenhängende Codeeinheit soll kommentiert werden

* Logdatei: wichtige Schritte bzw. Teilschritte eines Algorithmus sollen geloggt werden. Beispiel Logeintrag: 

‘Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");’

* Exception Handling: zur Erhöhung der Robustheit der Anwendung sollen alle kritischen Codestellen aufgefangen werden; frei nach Murphys Gesetz: was schief gehen kann, muss aufgefangen werden.


Ein wichtiger Punkt beim Exception Handling ist das Auffangen nicht behandelter Ausnahmen im Code. In diesem Projekt wurde dies mit folgendem Methodenaufruf realisiert:


‘Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));’


Eingesetzt in jede Activity, liefert dieser Aufruf den relevanten Auszug aus dem LogCat der Android-Entwicklungsumgebung. Hieraus ließ sich unmittelbar auf die Stelle im Code verweisen, die es zu debuggen galt.


**Perspektivisch** sollte bei hinreichend hoher Anzahl der Testfälle eine Testsuite angelegt werden, also die Testfälle in ein eigenes Package ausgelagert werden.  

Für Android-Apps stehen darüberhinaus auch Testtools zur Verfügung wie z.B. Testdroid, einem Cloud-Service, für Installations- und JUnit-Tests. Für Last- und Performance-Tests gibt es ebenfalls Dienstleister, z.B. [NeoLoad](http://www.neotys.de/solutions/mobile-load-testing).

#4. Umsetzung

Vieles wurde bereits hinsichtlich der Abweichungen zur Ist- und Soll-Analyse/-Konzeption und der eigentlichen Vorgehensweise gesagt. Aufbauend auf den Vorgaben des BA und den anfänglich verwendeten Software-Tools, stand zunächst auch ein klarer Ablauf fest. In praxi wurde jedoch entschieden, sich auf relevante Belange zu fokussieren, i.e. der Programmierung und Implementierung der Muss-Kriterien. Parallel wurden Protokolle geführt, Aufgaben koordiniert und Statusberichte erstellt und diese wiederum an den BA alle zwei Wochen kommuniziert. Die aus der stetigen Kommunikation resultierende Transparenz ermöglichte auch ohne die eingangs genannten Projektmanagement-Werkzeuge eine strukturierte Umsetzung der an das Projektteam sowie an das System gestellten Anforderungen.


Der tatsächliche Ablauf war wie folgt:

* Zunächst wurden in einem Kick-Off-Meeting mit dem BA und den künftigen Projektmitgliedern erste Informationen ausgetauscht sowie Restriktionen und Termine festgelegt. Das Team begann anschließend erste Ideen auszutauschen, sich zu einigen und Grundlagen zur Implementierung zu schaffen. Es wurden erste grobe Entwürfe gestaltet, welche wenige aber relevante Bestandteile der zu entwickelnden App enthalten sollten, aber auch bereits die Entwicklungsumgebung aufgesetzt. Entwickelt wurde mit Eclipse und den für die Entwicklung einer Android-App entsprechend notwendigen Plugins, wie z.B. den AVD- sowie den SDK-Manager.


* Bevor man aber überhaupt beginnen konnte, musste ein das eigene Projekt einleitende und beschreibende Exposé inkl. eines Milestone-Plans erstellt und vom BA abgenommen werden.


* Wie bereits eingangs geschildert, war die Vorgabe des BA, das Projekt iterativ und agil anzugehen. Daher wurde im Anschluss an die kurze aber intensive Analysephase, welche u.a. das Erzeugen von Use Cases in easyBacklog sowie weiteren Modellen und Diagrammen zur Modellierung des Aufbaus und der Anforderungen an das zu entwickelnde System beinhaltete, direkt die Designphase inkl. Prototyping angesiedelt. Es wurden erste Funktionen (splash-Seite inkl. Sound, Titel sowie zwei erste Quiz-Buttons (quiz, score) integriert, welche aber zunächst nur zur Orientierung dienten.


* Das Prototyping enthielt regelmäßige Releases/Versionen (in GitHub auch Tagging genannt) mit entsprechender Beschreibung der enthaltenen Erweiterungen. Der stets aktuellste und lauffähige Stand wurde als apk-Datei in einen für den BA sowie alle Projektmitglieder frei zugänglichen Dropbox-Ordner geladen. Mittels der bereits erwähnten AVD- und SDK-Manager, welche einen Emulator bereitstellten, aber auch in Verwendung der geladenen apk-Datei, konnten unmittelbar und umfassende Tests des jeweiligen Entwicklungsstandes der Lernapp erfolgen.


* Eine weitreichende Erweiterung - und ebenfalls Muss-Kriterium der App - sollte die Erstellung und Implementierung des Datenbank-Schemas in das Android-Projekt und die Eclipse-Umgebung bedeuten (relevante Klassen: PeatDataSource, PeatDBHelper und Question).


* Darauf aufbauend erfolgten weiterhin regelmäßige Tests und Erweiterungen, um die anfangs an das Projekt gestellten Anforderungen sowie Muss- und Soll-Kriterien in Form der modellierten Use Cases zu erfüllen.


* Schließlich konnte ein lauffähiger Abgabe-Prototyp final getestet und erzeugt sowie die Enddkumentation des Projektes #peat abgeschlossen werden.


* Die Abgabe der Arbeitsergebnisse erfolgte am 3. Juli.


* Die Präsentation vor dem BA fand am 8. Juli an der Beuth Hochschule für Technik statt.

##4.1. Plattform (Thomas, Andi, Steven)

Android, SDK und AVD, Java, XML, SQLite

##4.2. GUI (Thomas, Andi)

Das bereits beschriebene Architektur-Muster der Android-Entwicklungsumgebung ermöglicht es, dass zu jeder Komponente der App, in dem Fall zu jeder Activity, jeweils eine eigene Struktur gebaut werden kann. Die objektorientierte Programmierung wiederum stellt den globalen Zugriff und die Wiederverwendung von Objekten sicher. In der Android-Manifest-Datei wird die Hierarchie der Komponenten definiert. Nachstehend folgt ein Überblick über die wichtigsten Komponenten, aufbauend auf den Entwürfen der Designphase:


[Jeder sein Programmier-Anteil hins. XML]

###4.2.1. Screenshots je Activity

###4.2.2. Methoden

##4.3. Logik (Thomas, Andi, Steven)

[Einleitung]


Jeder sein Programmier-Anteil.

##4.4. Persistenz (Steven, Andi)

Zu Beginn, d.h. für den ersten lauffähigen Prototyp in der Designphase, lag der Fokus darauf, die ersten Komponenten abzustecken und eine Idee zu entwickeln, wie die Version **v1.0.1** zum Abgabetermin im Juli aussehen könnte. Demnach wurden die ersten Fragen in ein starres Array geschrieben, welches wiederum mittels eines if-Statements ausgelesen wurde. Nachstehende Abbildungen zeigen beispielhaft erläutertes Szenario:


![setNextQuestion-Array](https://github.com/andreasmosig/peat/blob/master/doc/MIS/setNextQuestionArray.png)


![setNextQuestion-ifStatement](https://github.com/andreasmosig/peat/blob/master/doc/MIS/setNextQuestionifStatement.png)


Doch Persistenz bedeutet in der Informatik die Fähigkeit, Datenstrukturen in nicht-flüchtigen Speichermedien, wie Dateisystemen oder Datenbanken zu speichern. Für das Erstellen des hierfür notwendigen Datenbank-Schemas (Entity-Relationship-Modell) wurde die Anwendung DBDesigner-Fork verwendet. Dieses Schema bildete die Grundlage für die #peat-Datenbank und deren Java-Klassen (PeatDataSource, PeatDBHelper, Question):

![DBDesign] (https://github.com/andreasmosig/peat/blob/master/doc/DB/DBDesign.png)


Hierbei machte es sich das Projektteam zu Nutze, dass z.B. keine JDBC-Verbindung benötigt wurde, sondern es bereits Bibliotheken zum Ansteuern der SQLite-Datenbank in der Android-/Eclipse-Entwicklungsumgebung gab.


Zunächst wurde eine leere Datenbank angelegt. Anschließend wurde ein entsprechendes SQL-Skript zur Erstellung der Tabellen geschrieben. Daran anknüpfend wurden entsprechende Methoden zum Ein- und Auslesen der Daten (Fragen, Antworten) codiert.

##4.5. Versionierung (fertig | Andi)

Das Versions- und Release-Management sind zentraler Bestandteil des Projektmanagements. Dabei geht es darum, dass das gesamte Projekt in seinem Wachstum begleitet wird. Korrekte Auslieferungen und Codezustände müssen jederzeit sichergestellt und Entwicklungslinien stets nachvollzogen werden können.


Für das vorliegende Projekt wurde zur verteilten Versionskontrolle Git verwendet. Git ist eine freie Software zur Unterstützung der verteilten Versionsverwaltung von Quellcode. Da es sich hierbei um eine verteilte Versionskontrolle handelt, besaß jedes Projektmitglied sein eigenes lokales Repository, in das er Änderungen einpflegen konnte. Die einzelnen individuellen Repositories konnten über bestimmte Operationen (z.B. push, pull) Informationen austauschen. Die lokalen Repositories ermöglichten daher weitgehend unabhängiges Arbeiten.


Die Versionskontrolle sollte im Optimalfall Teil eines Gesamtzyklus (Continious Integration) sein, bestehend aus einem CVS, einem automatisierten Buildprozess (z.B. mit Ant), Tests zur Sicherstellung der Codequalität (z.B. mit JUnit) und der Fehlerbeseitiung/-verwaltung (z.B. mit Bugzilla). Aufgrund des relativ überschaubaren Projektes, wurde während dieses Projektes auf automatisierte Buildprozesse, Testsuiten o.ä. verzichtet.


Das Projekt hatte nichtsdestotrotz dank der iterativen und agilen Vorgehensweise und der das gesamte Projekt umfassenden Verwendung von GitHub zur Verwaltung aller Projektinhalte (Quellcode, Releases, Exposé, Protokolle, Dokumentation sowie aller sonstigen Einstellungen, Dateien und Zustände, die für das Funktionieren des Systems relevant sind) zeitnah und jederzeit einen lauffähigen Code resp. Prototyp ([Durchstich](https://de.wikipedia.org/wiki/Prototyping_(Softwareentwicklung)#Vertikales_Prototyping_.28Durchstich.29)) zur Folge. Zusammengefasst nennt man die Summe der beschriebenen Systeme (Verions-, Release- und Konfigurationsmanagement) **Change Management**.


In GitHub konnten ständig Snapshots auf Versionsstände ([Releases](https://github.com/andreasmosig/peat/releases)) vorgenommen werden. Dies geschah mittels des sogenannten [Tagging](https://git-scm.com/book/en/v2/Git-Basics-Tagging) über die Git-Shell. Hierüber wurden auch Konflikte beim Mergen vom Code der einzelnen Repositories transparent gemacht und gelöst. Fehlerfreier Sourcecode wurde freigegeben und in das zentrale [Repository](https://github.com/andreasmosig/peat) übertragen. Zu Dokumentationszwecken konnte anhand der commits stets nachvollzogen werden, wer welche Änderung vorgenommen hat und welche Features integriert worden sind. Zum Download lag jederzeit die letzte auf ihre Lauffähigkeit hin getestete Version von #peat in einer Dropbox bereit: [Hol’ dir #peat](https://www.dropbox.com/sh/8djn2di76w9jqga/AABS1uvujSAhcy7iVWHPvo9oa?dl=0)!

#5. Schlussbetrachtung

##5.1. Zusammenfassung (Thomas, Andi, Steven)

Was zu Beginn nur ein Spiel gewesen ist, könnte nun das Lernen vieler Schüler und Studenten, Auszubildenden und anderen Lerninteressierten erleichtern und vielleicht sogar Freude bereiten.


Der erste Prototyp von #peat ist tatsächlich zu einer lauffähigen Android-App entwickelt worden. Der Fokus lag auf wenigen, aber relevanten Komponenten, deren Umsetzung bereits jetzt vielversprechend ist und den praktischen Einsatz der mobilen Applikation zulässt.


#peat ermöglicht das Abspeichern eigener Fragen und Antworten und deren Wiedergabe innerhalb des Quiz sowie eine Themen- und Benutzerverwaltung.

Mit etwas Glück und dem richtigen Marketing wird #peat nicht nur die Nummer 1 auf dem Markt der Lernapps sein. Auch die sich in Planung befindliche Website wird zur neuen Startseite unseres peers.

##5.2. Erkenntnisse (fertig | Andi)

Im Zuge der Projektarbeit stellte sich heraus, nachdem anfänglich noch easyBlock für die Anlage der Use Cases resp. asana für die Projektorganisation verwendet worden waren, dass die Arbeit mit Slack und moodle (Projektkommunikation und -organisation) und GitHub (Versionierung, Dokumentation) sowie das iterative Entwickeln und Testen in der Eclipse/Android-Umgebung völlig ausreichend, zufriedenstellend und insbesondere iterativ und agil waren. Es ließ sich viel effizienter arbeiten, da nebenher nicht viel dokumentiert und modelliert wurde. Im Nachhinein konnte festgestellt werden, dass die Teilprojekte und Subtasks gleichermaßen erfüllt werden konnten, allein mit den zuletzt genannten Werkzeugen: Slack, moodle und GitHub.


Eine weitere Erkenntnis ergab sich aus dem Arbeiten mit GitHub. Eine theoretische Grundlage besaß jedes Mitglied des Teams. Allerdings wurde noch nie praktisch mit der Versionsverwaltung gearbeitet. Daraus resultierten beim Zusammenführen besagter Codefragmente diverse Konflikte, die es über die Git-Shell zu lösen galt.


Doch es muss rückblickend durchaus auch kritisch beurteilt werden, was hinsichtlich der initialen Anforderungsanalyse und insbesondere die Einigung darauf, was tatsächlich umgesetzt werden sollte, gewissermaßen schief lief. Die Vorstellung darüber, was das System können sollte, war allen Teammitgliedern bewusst. Was das System allerdings tatsächlich können wird, offenbarte diverse Disparitäten. Denn die Erwartungen an die App waren recht groß, schlussendlich wohl übermotiviert und unrealistisch. Eine konkrete Aussage und Entscheidung, welche der Anforderungen für die Abgabe an den BA genügen werden müssten, wurden erst spät getroffen. Dies zeigte auch, dass es keine konkrete Führungsperson innerhalb der Projektgruppe gab. Je näher die Abgabe rückte, desto klarer wurde aber, dass es Entscheidungen bedurfte.


In diesem Zusammenhang ist ebenfalls hervorzuheben, dass die Grundlagen und Kenntnisse in der Programmierung nicht derart ausgeprägt waren und sind, sodass man diesbezüglich häufig an seine eigenen Grenzen stieß. Die Rollenverteilung (UI-Designer und Entwickler) wurde dahingehend noch eindeutiger definiert. Man konnte allerdings feststellen, dass die Gruppe aus unterschiedlichen Charakteren bestand. Ganz im Sinne der [Teamrollen](https://de.wikipedia.org/wiki/Teamrolle) nach Belbin gab es in dem Team #peat die unterschiedlichsten Vertreter (Umsetzer, Macher, Koordinator, Spezialist). Die richtige Kombination von verschiedenen Teamrollen machte dieses Team - bis auf die angesprochene Entscheidungsfindung für das lauffähige Arbeitsergebnis - effizient.

##5.3. Ausblick (fertig | Andi)

Aus den vorangegangen Ausführungen ist zu entnehmen, dass diese Lernapp noch viel Erweiterungspotential birgt. In der angeraumten Zeit hat man sich aber auf die relevanten Bereichen und Komponenten und Activities fokussiert.


Mögliche Erweiterungen der Nachfolgeversionen, beginnend bei **v2.0.1**, sind nachstehend stichpunktartig umrissen:


###a) Funktionale Anforderungen an die App:

* Angebot: Die GUI wurde vorbereitet auf das geplante Angebot mehrerer Fragekategorien, welches in **v2.0.1** realisiert werden SOLL (s. [2.1.](##2.1. Theoretische Aspekte einer Lernsoftware)).

* Settings: Eine Erweiterung der Funktionalitäten der Einstellungen-Activity SOLL erfolgen (intelligenter, selbstlernender Wiederholungsalgorithmus (s. [2.1.](##2.1. Theoretische Aspekte einer Lernsoftware)), Abbruch-/Fehlermeldung, Update-Steuerung, u.v.m.).

* Persistenz: Statt der Verwendung einer lokalen Datenbank (hier: SQLite), SOLL eine Anbindung an einen “[Backend-as-a-Service](http://t3n.de/news/backend-as-a-service-parse-504596/)”-Anbieter wie Parse realisiert werden (alternativ eine Remote-DB auf einem Server).

* Push-Notification: WIRD mit externen Diensten möglich gemacht:

  * [Parse-Tutorial](]https://parse.com/tutorials/android-push-notifications)

  * [Parse-QuickStart](https://parse.com/apps/quickstart#parse_data/mobile/android/native/new)

* Qualität: Bewertung von Fragen (Güte, Schwierigkeitsgrad) sowie eine gewisse Selbstreinigung ist hins. des Designs und der Anforderung definiert und umgesetzt. Die Logik geht allerdings mit einer Themen- und Nutzerverwaltung einher. Deren vollständige Ausarbeitung WIRD für die Version **v2.0.1** vorgesehen.

* Externer Webservice: KANN z.B. sein 

  * https://de.wikipedia.org/wiki/Wikipedia:Technik/Datenbank/API

  * https://www.mediawiki.org/wiki/API:Main_page/de


###b) Funktionale Anforderungen an die Website:

* Webpage-Prototyp: SOLL u.a. dem Download der App sowie dem Speichern von Fragen/Antworten dienen:

![PeatLanding] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/1_peatlanding.png)

![PeatSave] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/2_füllepeat.png)

![PeatFeedback] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/3_feedbackpeat.png)

* Webserver: SOLLTE z.B. sein: SAAS, oder lokaler Webserver (z.B. LAMP/XAMPP, Zugriff per DynDNS).

* Webframework: KÖNNTE z.B. sein: Bootstrap, ein auf CSS/LESS und JavaScript basierendes UI-Framework; für diverse Funktionaltitäten, wie Bentnutzerkontensteuerung und Authentifizierung sind gegebenfalls andere Frameworks und zusätlich ein Content Management System notwendig (z.B. Ruby on Rails, Silverstripe).


###c) Nicht-Funktionale Anforderungen an die App und an die Website:

* Look and feel: Die App und die Website SOLLEN für Jugendliche ab 13 Jahren verständlich und bedienbar sein.

* Compliance: Die Verwendung der App und der Website SOLL an die Akzeptanz eines Verhaltenskodex geknüpft sein.

* Performance: Die Anwendung SOLL in der Lage sein, im ersten Jahr bis 500.000 User zu verwalten und in den darauf folgenden 3 Jahren bis zu 5 Millionen.

* Community: Aus der Themen- und Nutzerverwaltung sowie der Bewertung von Fragen KANN, unterstützt durch eine webbasierte Lösung, der Gedanke von Contributors und Followern verfolgt werden.

#6. Weiterführende Links

* Rückblick

* Aktueller Stand

* Ausblick

* GitHub

* Projektmanagement (asana)

* Slack-Kanal

#7. Glossar

BA    Business Angel

bspw.    beispielsweise

bzgl.    Bezüglich

bzw.    beziehungsweise

CI    Corporate Identity

d.h.     das heißt

ggf.    gegebenenfalls

i.e.    id est

peer    Interessengruppe

RE    Requirements Engineering

resp.    respektive

SEO    Search Engine Optimization

u.a.    unter anderem

USP    Unique Selling Proposition

