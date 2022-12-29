
## links-scraper

### This is an example of Java code for extracting links from the pages of the specified website with subsequent writing all links to a text file

***Description:***

Code feature is that only those links are extracted that belong to the domain 
of the same website on which the search is performed. When links are extracted, 
they are written to a text file in the "data" folder. When searching for links, 
you must specify their estimated number. If the number of searched links exceeds
the number of links on the website, the search is stopped, and all found links
are recorded to the "links.txt" file.

***How to use:***

In the "Main" class, in the "websiteUrl" string, enter the path to the website 
from which you want to extract links. In the "resultsCount" variable, 
set the number of links you are looking for. Create the "Main" class run configuration 
in your IDE and start the program.

***Tools used:***

Java <br/>
Maven <br/>
Jsoup <br/>
