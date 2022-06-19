import java.util.Objects;

public record Account_Details(String Name, int Sortcode, long AccountNumber, double Ammount) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Account_Details) obj;
        return Objects.equals(this.Name, that.Name) &&
                this.Sortcode == that.Sortcode &&
                this.AccountNumber == that.AccountNumber &&
                Double.doubleToLongBits(this.Ammount) == Double.doubleToLongBits(that.Ammount);
    }

    @Override
    public String toString() {
        return "Account_Details[" +
                "Name=" + Name + ", " +
                "Sortcode=" + Sortcode + ", " +
                "AccountNumber=" + AccountNumber + ", " +
                "Ammount=" + Ammount + ']';
    }


}
