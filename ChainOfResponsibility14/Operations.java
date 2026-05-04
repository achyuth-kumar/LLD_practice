public abstract class Operations {

    Operations next;
    public Operations(Operations next) {
        this.next = next;
    }

    public abstract void processTransactions(Integer amount);
}

