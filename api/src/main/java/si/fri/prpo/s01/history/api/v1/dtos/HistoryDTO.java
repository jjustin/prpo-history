package si.fri.prpo.s01.history.api.v1.dtos;

import java.util.Date;

public class HistoryDTO {
    Integer inRoom;
    Integer numberOfPpl;
    Date date;

    public HistoryDTO(){}
    public HistoryDTO(Integer inRoom,Integer numberOfPpl, Date date) {
        this.inRoom = inRoom;
        this.numberOfPpl = numberOfPpl;
        this.date = date;
    }


    public Integer getInRoom() {
        return inRoom;
    }

    public void setInRoom(Integer inRoom) {
        this.inRoom = inRoom;
    }

    public Integer getNumberOfPpl() {
        return numberOfPpl;
    }

    public void setNumberOfPpl(Integer numberOfPpl) {
        this.numberOfPpl = numberOfPpl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
