import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by L on 13.03.2016.
 */
public class OperationHistory {

    private Date operationDate;
    private String operationType;
    private double operations;



    public OperationHistory(int year, int month, int day, String operationTitle , double operations) {

       this.operations = operations;
        this.operationType = operationTitle;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        operationDate = calendar.getTime();

    }

    public Date getOperationDate() {
        return operationDate;
    }

    public OperationHistory setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
        return this;
    }

    public double getOperations() {
        return operations;
    }

    public OperationHistory setOperations(double operations) {
        this.operations = operations;
        return this;
    }

    public String getOperationType() {
        return operationType;
    }

    public OperationHistory setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }


    public String data1() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        String operationDate1 = DATE_FORMAT.format(operationDate);
        return operationDate1;
    }
    public String data2() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");
        String operationDate2 = DATE_FORMAT.format(operationDate);
        return operationDate2;
    }
    public String data3(){
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM");
        String operationDate3 = DATE_FORMAT.format(operationDate);
        return operationDate3;
    }

    @Override
    public String toString() {
        return " | OperationDate: " + data1() +
                " | OperationType: '" + operationType + '\'' +
                " | Amount: " + operations +
                '}';
    }
}
