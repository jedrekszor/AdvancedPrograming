public class Main {
    public static void main(String[] args) {
////////////////////////////////////////////////////TASK1////////////////////////////////////////////////////
//        1.1)
//        Task1.Exercise1();

//        1.2)
//        Task1.Exercise2();

//        1.3)
//        Task1.Exercise3();

//        1.4)
//        Exercise4 e = new Exercise4();
//        SolarSystem.out.print(e);

//        1.5)
//        Exercise5 e = new Exercise5();
//        SolarSystem.out.print(e);
//        SolarSystem.out.print("\n");
//        e.fillOne();
//        SolarSystem.out.print(e);
//        SolarSystem.out.print("\n");
//        e.fillAll();
//        SolarSystem.out.print(e);

//        1.6)
//        Task1.Exercise6();

//        1.7)
//        Exercise7 e = new Exercise7(3, 4);
//        SolarSystem.out.print(e);
//        e.changeElement(0, 0, 100);
//        SolarSystem.out.print(e);
//        e.calculateRows();
//        e.calculateTotal();

//        1.8)
//        Task1.Exercise8();

////////////////////////////////////////////////////TASK2////////////////////////////////////////////////////
//        2.1)
//        Hangman hangman = new Hangman();

//        2.2)
//        Document document = new Document("Title");
//        document.AddText("test document. test test java.     example.test");
//        SolarSystem.out.println(document.CountWords());
//        SolarSystem.out.println(document.CountOccurences("test"));
//        document.SetUpperCase();
//        SolarSystem.out.println(document.getText());
//        SolarSystem.out.println(document.CountOccurences("test"));

////////////////////////////////////////////////////TASK3////////////////////////////////////////////////////
//        3.1)
//        for(int i = 0; i < 200; i++) {
//            Product product = new Product(1);
//            SolarSystem.out.println(product.test());
//        }

//        3.2)
//        Book book1 = new Book("test1", "authors1");
//        Book book2 = new Book("test2", "authors2");
//        SolarSystem.out.println(book1.getId() + " / " + book2.getId());

//        3.3)
//        Systems d = new Systems();
//        d.newSystem("Sistema Solar");                               //nome do sistema
//        d.addStar("Sistema Solar", "Sol");                      // acrescenta estrela a sistema
//        d.addPlanet("Sistema Solar", "Mercurio");             //acrescenta primeiro
//        // planeta do sistema solar...
//        d.addPlanet("Sistema Solar", "Venus");                //acrescenta segundo planeta
//        // do sistema solar...
//        d.addPlanet("Sistema Solar", "Terra");                //acrescenta terceiro planeta
//        // do sistema solar...
//        d.newSystem("Alfa Centauri");
//        d.addStar("Alfa Centauri", "Proxima Centauri");
//        d.addStar("Alfa Centauri", "Alfa Centauri A");
//        d.addStar("Alfa Centauri", "Alfa Centauri B");
//        d.addPlanet("Alfa Centauri", "Alfa Centauri Bb");
//
//        System.out.println(d.getPlanet("Sistema Solar", 2));   // venus
//        System.out.println(d.getStars("Alfa Centauri"));
//        // [Proxima Centauri , Alfa Centauri A, Alfa Centauri B]
//        System.out.println(d.existsSystem("Xanadu"));                     //false
//        System.out.println(d.existsSystem("Sistema Solar"));              //true

//        3.4)
//        Dictionary d = new Dictionary();
//        d.add("english", "LIVRO", "Book");
//        d.add("french", "LIVRO", "livre");
//        d.add("portuguese", "LIVRO", "livro");
//        d.add("english", "ANO", "year");
//        d.add("french", "ANO", "an");
//        d.add("portuguese", "ANO", "ano");
//        d.setLanguage("english");
//        System.out.println(d.get("ANO")); //year
//        d.setLanguage("portuguese");
//        System.out.println(d.get("ANO"));//ano
//        d.setLanguage("french");
//        System.out.println(d.get("LIVRO"));//livre

//        3.5)
//        Class t = new Class();
//        t.addStudent("José", 201301); //nome, nº de aluno
//        t.addStudent("Luis", 201303);
//        t.addStudent("Ana", 201302);
//        t.addGrade("Luis", 65); //nota do 1º teste do Luis
//        t.addGrade(201303, 80); //nota do 2º teste do Luis
//        t.addGrade("Luis", 85); //nota do 3º teste do Luis
//        System.out.println(t.getGrade(201303, 1)); //nota do 3º teste do Luis
//        System.out.println(t.getGrade("Luis", 2)); //nota do 2º teste do Luis

//        3.6)
//        Inventory t = new Inventory();
//        t.addProduct("Coca", 1234, 1); //nome, código, preço
//        t.addProduct("Cola", 1235, 2);
//        t.addProduct("Chipi", 1236, 3);
//        System.out.println(t.getPrice(1235)); //2
//        System.out.println(t.getPrice("Coca")); //1
//        System.out.println(t.getId("Chipi")); //1236
//        System.out.println(t.getNames()); //mostra todos os nomes

//        3.7)
        Temperaturas temperaturas = new Temperaturas();
        int [] t1 = { 1, 2, 3, 4, 5, 6, 7}; // min 1 max 7
        int [] t2 = { 1, 0, 2, 0, 2, 0, 7}; // min 0 max 7
        int [] t3 = { 1, 4, 2, 5, 2, 3, 7}; // min 1 max 7
        System.out.println("1");
        temperaturas.acrescenta(new TemperaturaDiaria(t1, "Aaa", "Coimbra") );
        System.out.println("2");
        temperaturas.acrescenta(new TemperaturaDiaria(t2, "Bbb", "Lisboa") );
        System.out.println("3");
        temperaturas.acrescenta(new TemperaturaDiaria(t3, "Ccc", "Porto") );
    }
}
