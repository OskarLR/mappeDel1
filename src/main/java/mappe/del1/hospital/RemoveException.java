package mappe.del1.hospital;

/**
 * Class RemoveException
 * Exception thrown by the remove method in the Department class to indicate missing Department
 * @version 1.01 2020-03-01
 * @author Oskar Remvang
 */
public class RemoveException extends Exception{

    private final long serialVersionUID = 1L;

    public RemoveException(String message) {
        super(message);
    }
}
