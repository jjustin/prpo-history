package si.fri.prpo.s01.history.api.v1.dtos;

import java.util.Date;

public class HistoryDTO {
    Integer inRoom;
    Date date;

    public HistoryDTO(){}
    public HistoryDTO(Integer inRoom, Date date) {
        this.inRoom = inRoom;
        this.date = date;
    }

    public Integer getInRoom() {
        return inRoom;
    }

    public void setInRoom(Integer inRoom) {
        this.inRoom = inRoom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
