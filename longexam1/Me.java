public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget > boracay.airFare) {
            System.out.println("Touchdown Bora!!!");
            budget = budget - boracay.airFare;
            checkBudget();

        } else {
            System.out.println("Walang pang Bora T^T");
            checkBudget();
        }
    }

    public void visit(Batanes batanes) {
        if (budget > batanes.airFare) {
            System.out.println("Let's go Batanes!!!");
            budget = budget - batanes.airFare;
            checkBudget();

        } else {
            System.out.println("Di ka muna aalis ng bahay!");
            checkBudget();
        }
    }

    public void visit(Cebu cebu) {
        if (budget > cebu.airFare) {
            System.out.println("Touchdown Cebu!!!");
            budget = budget - cebu.airFare;
            checkBudget();

        } else {
            System.out.println("Wala na money pang Cebuuuu!!");
            checkBudget();
        }

    }

    public void visit(LaUnion launion) {
        if (budget > launion.airFare) {
            System.out.println("OMW TO ELYU!!!");
            budget = budget - launion.airFare;
            checkBudget();

        } else {
            System.out.println("Cancelled muna ang Elyu");
            checkBudget();
        }
    }

    public void visit(Palawan palawan) {
        if (budget > palawan.airFare) {
            System.out.println("Enjoying my stay in Palawan");
            budget = budget - palawan.airFare;
            checkBudget();

        } else {
            System.out.println("Cry cry muna sa gedli T^T");
            checkBudget();
        }
    }

    public void visit(Siargao siargao) {
        if (budget > siargao.airFare) {
            System.out.println("Swimming sa Siargaoooo!!!");
            budget = budget - siargao.airFare;
            checkBudget();

        } else {
            System.out.println("Stay-in sa bahay, wala na money");
            checkBudget();
        }
    }

    public void checkBudget() {
        System.out.println("My budget is " + budget);

    }
}