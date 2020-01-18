package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMain {
    public static void main(String[] args) {
// Processor processor = new Processor();
// processor.execute(() -> System.out.println("This is an example text."));

//ExpressionExecutor expressionExecutor = new ExpressionExecutor();

//System.out.println("Calculating expressions with lambdas");
//expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

//System.out.println("Calculating expressions with method references");
//expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//PoemBeautifier poemBeautifier = new PoemBeautifier();

//poemBeautifier.beautify("Text to beautify", (text -> "ABC " + text + " ABC "));
//poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
//poemBeautifier.beautify("Text to beautify", (text -> " '' "  + text + " '' "));
//poemBeautifier.beautify("Text to beautify", (text -> text.replace(" ", "__")));
//poemBeautifier.beautify("Text to beautify", (text -> text.replaceFirst(" ", " -> ")));

//System.out.println("Using Stream to generate even numbers from 1 to 20");
//NumbersGenerator.generateEven(20);


//People.getList().stream()
//.map(s -> s.toUpperCase())
//.map(String::toUpperCase)
//.filter(s -> s.length() > 11)
//.map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//.filter(s -> s.substring(0,1).equals("M"))
//.forEach(System.out::println);


//BookDirectory theBookDirectory = new BookDirectory();
//Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//.filter(book -> book.getYearOfPublication() > 2005)
//.collect(Collectors.toMap(Book::getSignature, book -> book));
//System.out.println("# elements: " + theResultMapOfBooks.size());
//theResultMapOfBooks.entrySet().stream()
//.map(entry -> entry.getKey() + ": " + entry.getValue())
//.forEach(System.out::println);

//BookDirectory theBookDirectory = new BookDirectory();
//String theResultStringOfBooks = theBookDirectory.getList().stream()
        //.filter(book -> book.getYearOfPublication() > 2005)
        // .map(Book::toString)
        // .collect(Collectors.joining(",\n", "<<", ">>"));

//System.out.println(theResultStringOfBooks);

     Forum forum = new Forum();
     Map<Integer, ForumUser> mapOfForumUsers = forum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getPostsNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getNumberOfUser, forumUser -> forumUser));

     mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);

    }
}