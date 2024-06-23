package ru.kors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        beanScopesTest();
    }

    private static void beanScopesTest() {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(InMemoryMessageDAO.class);
        ctx.refresh();

        var mDAO1 = ctx.getBean(InMemoryMessageDAO.class);
        mDAO1.addMessage("Hello ");
        mDAO1.addMessage("From ");

        var mDAO2 = ctx.getBean(InMemoryMessageDAO.class);
        mDAO2.addMessage("beanScopesTest()!");

        var mDAO3 = ctx.getBean(InMemoryMessageDAO.class);
        var messages = mDAO1.getMessages();
        messages.forEach(System.out::print);
    }

    private static void valueInject() {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Author.class, AuthorConfig.class);
        ctx.refresh();

        Author author = ctx.getBean(Author.class);
        System.out.println(author);
    }

    private static void difAppContext() {
        var parent = new AnnotationConfigApplicationContext();
        parent.register(Role.class);
        parent.refresh();

        var child = new AnnotationConfigApplicationContext();
        child.register(AuthorConfig.class);
        child.setParent(parent);
        child.refresh();

        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Author.class);
        ctx.setParent(child);
        ctx.refresh();

        Author author = ctx.getBean(Author.class);
        System.out.println(author.toString() + author.getRole());
    }
}
