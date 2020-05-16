import java.util.Arrays;
import java.util.concurrent.atomic.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public volatile int counter;


    public static void main(String[] args) {
        String string = "I am a string. Yes, yes I am.";
        System.out.println(string);

        String string2 = string.replaceAll("[Yy]es","no");
        System.out.println(string2);

        String string3 = string.replaceAll(".","y");
        System.out.println(string3);

        String[] array = {"a","b","c"};
        System.out.println(Arrays.toString(array));

        boolean matched = string.matches("I am a string");
        System.out.println(matched);

        String string4 = "abcDeefGhijklmnopqrabcSTUVWYYZ0123456789";
        String string5 = string4.replace("abc", "___");
        System.out.println(string5);

        String string6 = string4.replaceAll("789$","END");
        System.out.println("string6: " + string6);

        System.out.println(string5.matches("^___"));

        String regex = "^abc";
        System.out.println(string4.matches(regex));

        "harry".replaceAll("[hH]arry","Harry");

        String vowely = "abcDeeeFghijklmnopqrstuvwxyz".replaceAll("[^aeiou]","X");
        System.out.println(vowely);

        String sGroup = "setValue".replaceAll("set(Value)?","gotcha"); //Value is a Group.

        System.out.println(sGroup);

        String consonants = "abcdefghijklmnopqrstuvwxyz".replaceAll("([aeiou])","_");
        System.out.println(consonants);

        String nums = "1234567".replaceAll("\\d","num");
        System.out.println(nums);

        String digi = "123448473ASDFADasfhaskdlha13489203482903";
        String digitize = digi.replaceAll("\\D","digit");
        System.out.println(digitize);

        String hasWhitespace = "I have blanks and \t a tab and a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s","")); //removes all white spaces
        System.out.println("stringy\tbeans".replaceAll("\t",""));

        String toMarkUp = "Each word needs a strong tag around it.  I really want to wrap each and every word";

        String markedUp = toMarkUp.replaceAll("\\b(\\w+)\\b","<span>$1</span>");

        System.out.println(markedUp);

        String x = "abcDeeeF12Ghhiiiijkl99z".replaceAll("[a-fA-F3-8]","X");
        System.out.println(x);

        String regexy = "(?iu)[a-f3-8]"; //case insensitivy for unicode u.

        String eee = "aeeeiou";
        String yyy = eee.replaceAll("e{3}","yyy"); //string quantifier
        System.out.println(yyy);

        String y = eee.replaceAll("ae*","yyy"); //zero or more of the e character.  use case: optional user input
        System.out.println(y);

        String stringy = "abcDeeeF12Ghhiiiiijkl99z";

        //replace all the h's and i's with "hello
        String helloStringy = stringy.replaceAll("h{1,3}i{1,5}","hello");
        System.out.println(helloStringy);

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Subheading</h2>");
        htmlText.append("<p>Another paragraph about something else");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        Pattern pattern = Pattern.compile("<h2>",Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches()); //this returns as false.  matcher() wants to match string as a whole.

        String regexH2 = ".*<h2>.*"; //accepts nothing or anything before and after it.
        Pattern patternH2 = Pattern.compile(regexH2); //compile a pattern by feeding it a regex
        Matcher matcher2 = patternH2.matcher(regexH2); //create a matcher object. feed the compiled pattern a regex
        System.out.println(matcher2.matches()); //.matches() returns a boolean

        boolean p = Pattern.matches("a*b","aaaaaaab");
        System.out.println(p);

        String regex3 = "a*bcdefghi*";
        Pattern pat3 = Pattern.compile(regex3);
        Matcher match2 = pat3.matcher(regex3);

        StringBuilder h2Text = new StringBuilder("<h2>This is a level 2 heading html tag</h2>");
        h2Text.append("<h2>another level two heading for the h2Text</h2>");

        String h2Regex = "(<h2>.*</h2>)";
        Pattern h2Pattern = Pattern.compile(h2Regex,Pattern.MULTILINE);  //create a pattern for the h2 regex, by providing the regex as input into the pattern
        Matcher h2Matcher = h2Pattern.matcher(h2Text); //create a matcher object, which was built with our pattern object.  pass in the text we want to match with the regex pattern
        System.out.println(h2Matcher.matches()); //returns a boolean of whether the String passed into it, matches with the regex pattern.
        h2Matcher.reset();

        while(h2Matcher.find()) {
            System.out.println("Occurrence : " + h2Matcher.group(1));
        }

//        =================================
        StringBuilder divText = new StringBuilder("<div>\n");
        divText.append("\t<h2>This is the title. I made this a level 2 heading</h2>\n");
        divText.append("\t<h2>This is a level 2 heading</h2>\n");
        divText.append("\t<p>This is a paragraph tag</p>\n");
        divText.append("\t<div>a nexted div</div>\n");
        divText.append("\t<div>another nested div1</div>\n");
        divText.append("\t<div>another nested div2</div>\n");
        divText.append("\t<div>another nested div3</div>\n");
        divText.append("\t<h2>Here goes yet another level 2 heading. so many of these!</h2>\n");
        divText.append("\t<footer>This is the bottom  of the page</footer>\n");
        divText.append("</div>");

        System.out.println(divText);

        //1. create a regex
        String divRegex = "<div>(.*?)</div>";
        //2. create a pattern object. pass in the regex.
        Pattern divPattern = Pattern.compile(divRegex,Pattern.DOTALL);  //The regular expression . matches any character except a line terminator unless the DOTALL flag is specified.
        //3. create a matcher object off of the pattern object just created.  pass in some text for the matching
        Matcher divMatcher = divPattern.matcher(divText);
        System.out.println("div matcher : " + divMatcher.matches());
        divMatcher.reset();

        while(divMatcher.find()) {
            System.out.println("Found a div tag: " + divMatcher.group());
        }

        String groupRegex = "([abc]){3}";

        System.out.println("abc".matches(groupRegex));
        System.out.println("abc".replaceAll(groupRegex,"xyz"));

        System.out.println("harry".replaceAll("[H|h]arry","Larry")); //or regex

        String regexNot = "t[^v]"; // match a t followed by anything OTHER than a v

        String positiveLookahead = "a(?=.*\\d)"; //a followed by anything ending with a d
        String andy = "annnnnnnnnnnnnnnnnnnn1";

        Pattern posPattern = Pattern.compile(positiveLookahead);
        Matcher lookMatcher = posPattern.matcher(andy);
        System.out.println("look ahead matched? " + lookMatcher.matches());

        boolean found = Pattern.compile("[a-z]+,")
                .matcher("bat, cat, dog, fox")
                .find();
        System.out.println(found);

        boolean positiveLookupFound = Pattern.compile("\\d+(?=\\scm)").matcher("200 cm").find();  //positive lookahead to find a number ending with a space \s cm
        System.out.println(positiveLookupFound);

        Pattern positiveLookupPattern = Pattern.compile(".(?=y)"); //find any single character preceding a y
        Matcher positiveLookupMatcher = positiveLookupPattern.matcher("sky, cry, sigh, guy, buy, my, my, my");

        while (positiveLookupMatcher.find()) { //whenever the matcher comes across a regex match, pring the most recently captured group
            System.out.println(positiveLookupMatcher.group());
        }

        String carModels = "m3, lx470, s500, 350z, 300zx, maxima, taurus.";
        String carsRegex = "";
        Pattern carsPattern = Pattern.compile(carsRegex);
        Matcher carsMatcher = carsPattern.matcher(carModels);


        String phoneRegex = "\\((\\d){3}\\)\\s*(\\d){3}-?(\\d){4}$";
        System.out.println("(123)456-7899".matches(phoneRegex));

        //match a visa number


















































    }
}
