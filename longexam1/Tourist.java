interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Batanes batanes);

    void visit(Cebu cebu);

    void visit(LaUnion launion);

    void visit(Palawan palawan);

    void visit(Siargao siargao);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}