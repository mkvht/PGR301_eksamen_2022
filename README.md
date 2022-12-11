# Eksamen 2022
## DevOps i Skyen


### Del 1: DevOps-prinsipper
***[1.1] Hva er utfordringene med dagens systemutviklingsprosess - og hvordan vil innføring av DevOps kunne være med på å løse disse? Hvilke DevOps prinsipper blir brutt?***

Prinsippene til DevOps modellen er:
* Collaboration
* Automation
* Continuous Improvement and Delivery
* Customer-Centric Action
* Create with a goal in mind

En stor årsak til at DevOps utvikling har nylig blitt mer ettertraktet er DevOps sin egenskap til å organisere og effektivisere utviklingsprosessen. Tradisjonelt har utviklerteam, bygget opp av utviklerene (Dev, de som skaper produktet), og Operations (Ops, de som sørger for testing og deployment av produktet) jobbet i separate team. Dette har historisk ledet til dårlig eller manglende kommunikasjon mellom de to teamene. Ved å separere disse teamene oppstår det en "wall of confusion" hvor tekniske- og forståelsesproblemer dukker opp. Dette medfører at begge teamene potensiellt produserer waste (unødvendig arbeid) og at oppgaver kan ta mye lengre tid før alt er klart til deployment. I tillegg betyr det at om noe går galt etter deployment tar det mer tid og resusser til å rette opp i feilen. 

Det overnevnte er et stort problem i dag ettersom markedet har blitt ekstremt krevende. Kunder forventer oftest at programmene de bruker skal ha god ytelse, god oppfølging og oppdateres etter behov relativt raskt. Dette er noe som DevOps får til ved å gjøre om på hvordan teamene er satt sammen i tillegg til å gi tilgang til verktøy som gjør overgangen fra utvikling til operations mye enklere.

En stor del av DevOps er å identifisere "flaskehalser". Dette vil si, steder i utviklingsprosessen der arbeidet "stopper opp". Et eksempel kan være at en "Ops" ikke forstår hvorfor en "Dev" har gjordt spesifikke valg i koden. Om det oppstår spørsmål må de kontakte Dev teamet og vente på svar. Utfallet av dette kan være unødig tidsbruk, da Dev teamet ikke nødvendigvis er umiddelbart tilgengelig. Med DevOps kan man unngå disse problemene da utvikleren selv har ansvar for å vedlikeholde koden og utføre både "dev" og "ops" selv. På denne måten kan vi redusere flaskehalser.

Et vanskeligere DevOps prinsipp som ofte ikke følges opp korrekt er prinsippet om continuous deployment. DevOps prinsipper er ikke noen man kan implementere uten videre. En av de største årsakene til at DevOps kan faile er at man har forsøkt å implementere DevOps uten omtanke til hvordan det vil fungere sammen med eller påvirke andre relaterte prosjekter. I tillegg er det vanskelig å legge om et eksisterende prosjekt til DevOps. For eksempel må man tenke på om prosjektet bruker "Trunk-based development workflow" eller "Feature-based development workflow". I et Trunk-based development workflow prosjekt pusher man som regel all koden til kun en "branch" (main), mens i et Feature-based development workflow prosjekt pusher man inn i mange forskjellige branches i prosjektet hvor de senere blir merget inn i main. Med DevOps prinsippene burker man Feature-based workflow da det hindrer merge-conflicts om mange utviklere jobber på samme prosjekt. Dette tillater at man kan deploye små endringer ofte uten at man eksempelvis ødlegger for andre og at det i tillegg er eklere å gå tilbake om det skulle skje noe feil.

<br>
<br>

***[1.2] En vanlig respons på mange feil under release av ny funksjonalitet er å gjøre det mindre hyppig, og samtidig forsøke å legge på mer kontroll og QA. Hva er problemet med dette ut ifra et DevOps perspektiv, og hva kan være en bedre tilnærming?***

DevOps prinsippene peker mot mindre og hyppige deployments istedet for større. Dette er først og fremst fordi markedet er veldig krevende og kunder ønsker oftere å få rakse oppdateringer og fikser enn å vente lenger tid på store endringer. I tillegg er det ofte enklere og ryddigere for utviklerene når de skal pushe kode til prosjektet. Ved å pushe mindre biter med kode er det enklere for mange utviklere å jobbe sammen uten å skape merge-conflicts. Det er også enklere å finne "feil" i koden og hvor de kom inn. Om man pusher en liten ending istedet for en stor er det lettere for utvikleren å gå tilbake til den forrige versjonen som fungerte uten å miste masse kode og arbeid. Dette effektiviserer arbeidet og lager en mulighet for at en stor gruppe med utviklere kan ta annsvar for små oppgaver (en utvikler lager funksjon "addProduct" mens noen andre lager "listProduct") uten at de forstyrrer hverandres arbeid. 

<br>
<br>

***[1.3] Teamet overleverer kode til en annen avdelng som har ansvar for drift - hva er utfordringen med dette ut ifra et DevOps perspektiv, og hvilke gevinster kan man få ved at team han ansvar for både drift- og utvikling?***

Når et team jobber med både "dev" og "ops" kan man unngå "flaskehalser". Man reduserer muligheten for miskommunikasjon, "tapt kunnskap" (Utvikler kan ikke nødvendigvis bruke de samme verktøyene eller har samme kunnskap som drift-ansvarlig) og "the wall of confusion". I et tradisjonelt utviklermiljø der dev og ops jobber separat oppsår det oftere unødig tidsbruk på at dev og ops venter på svar fra hverandre eller at de ikke skjønner hvorfor det andre teamet mener noe er feil. Dette kan eksempelvis omhandle kodevalg eller tekniske feil relatert til verkøy (dev og ops bruker ikke nødvendigvis samme type verktøy).

<br>
<br>

***[1.4] Å release kode ofte kan også by på utfordringer. Beskriv hvilke- og hvordan vi kan bruke DevOps prinsipper til å redusere eller fjerne risiko ved hyppige leveraner.***

Om mange utviklere pusher kode til samme branch vil det øke sansynligheten for merge-conflicts som tar tid og nøyaktighet å løse. 

<br>
<br>

### Del 2: CI
Oppgave 1:
Workflow kjører ved pull og push til master

Oppgave 2:
 - Enhetstester failet (gjordt)
 - Fikset enhetstester (Godkjent i github actions) + pipelines
 - Workflowen kompilerer javakoden og kjører enhetstester på hver eneste push, *uavhengig av branch*

Oppgave 3:
Branch protection og status sjekker - Beskriv hva sensor må gjøre for å konfigurere sin fork på en slik måte
at

* Ingen kan pushe kode direkte på main branch
* Kode kan merges til main branch ved å lage en Pull request med minst en godkjenning
* Kode kan merges til main bare når feature branchen som pull requesten er basert på, er verifisert av GitHub Actions.


### Del 3: Docker


### Del 4: Metrics, overvåkning og alarmer


### Del 5: Terraform og CloudWatch Dashboards
