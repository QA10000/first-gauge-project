# Search Specification

table: /src/test/resources/user_data.csv

Created by kalra on 2/22/2020
// in line 13 we are reading data from the csv file search_textg coumn , ti will be saved scenario data store in search result pate implientation file
and in line 24 then it will be use in line 30
Three types of data stores,  scenario , spec and suite. Sceanrio one is only for scenario , spec one for spec , suite one is for suite
This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
search_text is a scenario data store , it will fail even though we have full code
     
## User search for item
* User login into marketplace using username <email> and password <password>
* Verify title of home page
* User search for item <search_text>
* Verify search result

