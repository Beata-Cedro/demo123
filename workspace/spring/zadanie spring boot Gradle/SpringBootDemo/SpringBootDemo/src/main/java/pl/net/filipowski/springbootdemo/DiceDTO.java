package pl.net.filipowski.SpringBootDemo.dive;

public class DiceDTO {
    private Long id;
    private Integer result;

    public DiceDTO(){
    }

    public DiceDTO(Long id, Integer result) {
        this.id = id;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "DiceDTO{" +
                "id=" + id +
                ", result=" + result +
                '}';
    }
}
