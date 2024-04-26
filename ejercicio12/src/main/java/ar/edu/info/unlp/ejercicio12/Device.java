package ar.edu.info.unlp.ejercicio12;

public class Device {
  private Display display;
  private Connection connection;
  private CRCCalculator crcCalculator;
  private Ringer ringer;

  public Device() {
    this.display = new Display();
    this.connection = new ConnWifi();
    this.crcCalculator = new CRC16Calculator();
    this.ringer = new Ringer();
  }

  public String sendData(String data) {
    long crc = this.crcCalculator.crcFor(data);
    return this.connection.sendData(data, crc);
  }

  public void changeCrcCalculator(CRCCalculator crcCalculator) {
    this.crcCalculator = crcCalculator;
  }

  public void changeConnection(Connection newConnection) {
    if (newConnection.getClass() != this.connection.getClass()) {
      this.connection = newConnection;
      this.display.showBanner(this.connection.pict() + " - " + this.ringer.ring());
    } else {
      this.display.showBanner("ya se encuentra usando esta conexion" + " - " + this.connection.pict());
    }
  }

}
