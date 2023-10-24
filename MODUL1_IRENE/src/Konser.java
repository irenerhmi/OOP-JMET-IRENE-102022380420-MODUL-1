public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String namaBand;
    private String tanggal;
    private String lokasi;
    private float ticketPrice;

    public void setNamaBand(String namaBand) {
        this.namaBand = namaBand;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getNamaBand() {
        return namaBand;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    
}