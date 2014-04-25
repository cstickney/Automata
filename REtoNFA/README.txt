Christopher Stickney
011385713
c.stickney117@gmail.com
-ReToNfa.java : The main file. Creates an NFA from a RE.
-Node.java : The program's node class. Contains destination nodes and outdegree.
-Nfa.java : The program's NFA class. Contains set of nodes, start and final states.
-README.txt : This readme file!

This program allows users to input a regular expression, using any combination of the letters a-e, E (epsilon), and the + (union), & (concatenation) and * (kleene star) operations, in order to generate a table containing all the state changes in the NFA that represents the RE. Note: this program only accepts the characters {a,b,c,d,e,E,0,+,&,*}. Using any other characters in your RE will cause the program to exit. 

To compile this program:
1. Download and install Eclipse and the JavaSE-1.7 runtime environment.
2. Open Eclipse and create a new project
3. Name the project, select the JavaSE-1.7 JRE, then hit finish
4. Create a new package in this project named "reToNfa"
5. Copy and paste the included java files into the package.
6. Either press CTRL+F11 to run the program in the console, or right click on your project, click export, and create a runnable jar file and run that.
