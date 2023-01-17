package PacoteTratamentoExcexcoes.Boa.entities;
import PacoteTratamentoExcexcoes.Boa.exceptions.DomainException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*Feita por mim */

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException(" A data de check-out deve ser posterior à data de check-in");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        //System.out.println("teste variavel now" + now);
        if (checkOut.before(now) || checkIn.before(now) ) {
            throw new DomainException(("As datas de reserva para atualização devem ser datas futuras"));
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("A data de check-out deve ser posterior à data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    @Override
    public String toString() {
        return "Room "
                + roomNumber +
                ", checkIn = " +
                sdf.format(checkIn) +
                ", checkOut = " +
                sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }
}
