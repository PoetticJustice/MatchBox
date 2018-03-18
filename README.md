<p>The following code is for a class named&nbsp;<code>Box</code>. The class&nbsp;<code>Box</code>&nbsp;includes a constructor method&nbsp;<code>Box</code>, and a method&nbsp;<code>getVolume()</code>.</p>
<p>For your assignment you are to develop a java class named&nbsp;<code>MatchBox</code>. Your class&nbsp;<code>MatchBox</code>&nbsp;must extend the class&nbsp;<code>Box</code>&nbsp;and in addition to the attributes width, height, and depth that are defined in the class&nbsp;<code>Box</code>,&nbsp;<code>MatchBox</code>&nbsp;must add a new attribute weight. The&nbsp;<code>getVolume</code>&nbsp;method must both report the values of width, height, depth, and weight, but must also calculate and report the volume by multiplying height by width by depth. The class&nbsp;<code>MatchBox</code>&nbsp;must also add the method&nbsp;<code>calculateWeight()</code>&nbsp;that will calculate weight based upon the volume assuming that the volume is a quantity of water which weighs .03611 pounds per cubic inch. Also method&nbsp;<code>calculateWeight</code>&nbsp;should show the result like this: weight of&nbsp;<code>MatchBox</code>&nbsp;is X.</p>
<p>For example a car class can inherit some properties from a&nbsp;<code>General</code>&nbsp;vehicle class. Here we find that the base class is the vehicle class and the subclass is the more specific car class. A subclass must use the extends clause to derive from a super class which must be written in the header of the subclass definition. The subclass inherits members of the superclass and hence promotes code reuse. The subclass itself can add its own new behavior and properties.</p>
<p>Your new class must include a main method that creates a new&nbsp;<code>MatchBox</code>&nbsp;object, calls the&nbsp;<code>getVolume</code>&nbsp;method and reports the results by printing the following items to the screen (where the X is replaced by the calculated value) For your assignment, assume that the value of width is 5, height is 10, and the depth is 3. The output should look like the following with X replaced with the appropriate calculated value.</p>
<p>width of MatchBox is X<br />height of MatchBox is X<br />depth of MatchBox is X<br />weight of MatchBox is X<br />Volume is: X</p>
<h3>Helpful Hints</h3>
<p>When creating this assignment you should assume a java file for each component. First create a Box.java to hold the&nbsp;<code>box</code>&nbsp;class, a MatchBox.java for the&nbsp;<code>MatchBox</code>&nbsp;class and a main.java for the&nbsp;<code>main</code>&nbsp;routine. All three files, when using Netbeans must belong to the same package so make sure you use the package statement at the beginning of each file.</p>
<p>Keep in mind that in the new class&nbsp;<code>MatchBox</code>, you can either use the methods and variables in the&nbsp;<code>Box</code>&nbsp;class, redefine methods or variables for the&nbsp;<code>MatchBox</code>&nbsp;class that exist in&nbsp;<code>Box</code>&nbsp;or create new methods and variables.</p>
<p id="yui_3_17_2_1_1521398311466_90">The class&nbsp;<code>Box</code>&nbsp;is as follows:</p>
<pre>class Box {
 
   double width;
   double height;
   double depth;
 
   // This is an empty constructor
   Box() {
          ;
   }
 
   Box(double w, double h, double d) {
          width = w;
          height = h;
          depth = d;
   }
 
   void getVolume() {
          System.out.println("Volume is : " + width * height * depth);
   }
}</pre>
