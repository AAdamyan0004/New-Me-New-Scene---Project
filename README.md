# New-Me-New-Scene---Project


**LAST YEAR AND THIS YEAR EXPLAINED**
In both files, I prioritize using loops to draw multiple images that talk about my goals, accomplishments, places I went to, and two effectsthat I use in the beginning of the program. I have only used chatgpt to debug one issue that was in my program. I also asked Mr aiello for help and stack overflow(because I forgot how to write multi line comments :(

From my experience, chstgpt is by far the best tool to help solve errors in my app, its fast, explains how to fix and how to avoid similar problems in the future. But asking a teacher is always better if you are in a classroom.






**UML DIAGRAM**
<img width="705" height="294" alt="image" src="https://github.com/user-attachments/assets/f7c85552-09c8-41fb-934c-416d4bf67291" />


**CITATIONS**

<img width="745" height="419" alt="image" src="https://github.com/user-attachments/assets/286e3045-8c01-4375-b252-ea4b1a636b3a" />

**MY PROMPT**
"Fix this"

**CHATGPT RESPONSE:**
Got it — this is a classic Java gotcha, and the compiler errors are actually pointing to two separate issues.
This tells us that range and min are not visible where you’re using them. In other words, you’re trying to use them outside the method where they’re declared.

Also, there’s a logic bug with how Math.random() is cast.

public int generateNumber(int min, int max) {
    int range = max - min + 1;
    return (int)(Math.random() * range) + min;
}

int random = (int)(Math.random() * range) + min;
⚠️ That line is outside the generateNumber method, so range and min don’t exist there.

