**RIJKSMUSEUM DATA API TEST**S

Limitations of the Project: I had limited time 
to work on this assignment. On November 2, 2023,
I learned that I had my driving license exam scheduled
for November 8. Due to the urgency of preparing for the exam, 
I had to temporarily move to Utrecht, away from my accommodation.
I drove with my instructor for hours to intensive exam 
preparation. I allocated the all  remaining time to this
assignment. Unfortunately, I couldn't bring a second monitor,
which would have been helpful. Despite all this, I did my best
under the circumstances.

**Work Flow:**
First, I read the document several times to understand it. 
Then, I created a collection in POSTMAN to run some tests 
manually. I executed some of the tests there. After that, 
I set up a Cucumber framework with POM structure in IntelliJ
and ran the tests there.

**Encountered Errors and Issues:**
The fact that all the status codes in the response body
are always 200 can sometimes prevent you from detecting 
bugs. To illustrate this, I deliberately set the expected 
status code to 404 in one of the tests (because that data
doesn't exist in the dataset), and then I received an error
message. Otherwise, it always returns 200.

Another important point is that to perform query operations
correctly, you need to retrieve all the data. However,
I can only fetch limited data. If I don't provide any 
parameters, I get 10 data entries. For example, I set 
the p parameter to 1 and the ps parameter to 100 to fetch 
more data. Then, I tested sorting with the "s" parameter, 
using both "asc" and "desc" sorting. Logically, the first 
element of the data returned should be the last element when 
sorting in descending order. However, it doesn't behave
this way; it returns different data. This suggests that 
there might be an issue with how the data is sorted.

Due to time constraints, I couldn't cover all the tests
mentioned in the documentation, so I chose some examples. 
I also noticed that some code segments were repeated(I know DRY  :) ).
Please do not judge me for this because I had to move very 
quickly due to my circumstances. I appreciate your understanding
in this matter.

After completing the work, I uploaded it to GitHub and attempted
to generate reports by running it on Jenkins.

I am very grateful for your understanding.

