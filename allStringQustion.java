package StringFullQustion;
import java.util.Locale;
public class allStringQustion {
        public static void main(String[] args) {
            String str = "what is your favorite game name";
            String str2 = "My favorite game is Cricket";
            String str3 = "";
            // charAt() method:
            System.out.println("first the chatAt:"+str.charAt(12));
            // codePointAt() method:
            System.out.println("2nd  the codePointAt():"+str2.codePointAt(5));
            // codePointBefore() method:
            System.out.println("3rd  codePointBefore(): "+str.codePointBefore(2));
            // codePointCount() method:
            System.out.println("4th  codePointCount(): "+str2.codePointCount(6,7));
            // compareTo() method:
            System.out.println("5th  compareTo(): "+str.compareTo(str2));
            // compareToIgnoreCase() method:
            System.out.println("6th  compareToIgnoreCase(): "+str2.compareToIgnoreCase(str));
            // concat() method:
            System.out.println("7th using the concat():"+str.concat(str2));
            // contains() method:
            System.out.println("8th the contains(): "+str.contains("game"));
            // contentEquals() method:
            System.out.println("9th  contentEquals(): "+str.contentEquals("Cricket"));
            // endsWith() method:
            System.out.println("11th using the endsWith(): "+str.endsWith("favorite"));
            // equals() method:
            System.out.println("12th  equals(): "+str.equals(str2));
            // equalsIgnoreCase() method:
            System.out.println("13th  the equalsIgnoreCase(): "+str.equalsIgnoreCase("your"));
            // format() method:
            System.out.println( String.format("14th using the format(): "+str,str2) );
            // getBytes() method:
            System.out.println("15th using the getBytes(): "+str2.getBytes());
            // hashCode() method:
            System.out.println("17th the hashCode(): "+str.hashCode());
            // indexOf() method:
            System.out.println("18th using the indexOf(): "+str2.indexOf("Cricket"));
            // intern() method:
            System.out.println("19th this is intern(): "+str.intern());
            // isEmpty() method:
            System.out.println("20th using the isEmpty(): "+str3.isEmpty());
            // lastIndexOf() method:
            System.out.println("21th  using the lastIndexOf(): "+str2.lastIndexOf("r"));
            // length() method:
            System.out.println("22th using the length(): "+str.length());
            // matches() method:
            System.out.println("23th using the matches(): "+str2.matches(str));
            // offsetByCodePoints() method:
            System.out.println("24th this is  offsetByCodePoints(): "+str2.offsetByCodePoints(4,7));
            // regionMatches() method:
            System.out.println("26th  replace(): "+str2.replace('n','o'));
            // replaceFirst() method:
            System.out.println("27th using the replaceFirst(): "+str.replaceFirst("your","Cricket"));
            // replaceAll()  method:
            System.out.println("28th is the replaceAll(): "+str2.replaceAll(str2,"you are playing like child"));
            // split() method:
            System.out.println("29th using the split(): "+str.split(str2,18));
            // startsWith() method:
            System.out.println("30th is the startsWith(): "+str2.startsWith("My"));
            // subSequence()  method:
            System.out.println("31th is subSequence(): "+str.subSequence(2,9));
            // substring() method:
            System.out.println("32th  the substring(): "+str2.substring(6,12));
            // toCharArray() method:
            System.out.println("33th is the toCharArray(): "+str.toCharArray());
            // toLowerCase() method:
            System.out.println("34th toLowerCase(): "+str2.toLowerCase());
            // toString() method:
            System.out.println("35th using the toString(): "+str.toString());
            // toUpperCase() method:
            System.out.println("36th  toUpperCase(): "+str.toUpperCase(Locale.ROOT));
            // trim() method:
            System.out.println("37th using the trim(): "+str.trim());
            // valueOf() method:
            System.out.println("38th  valueOf(): "+str2.valueOf(8));
        }
    }

