package Controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class MoonController {
    @GetMapping("getMoonCycle")
    public String getMoonCycle(){ return getMoonCl(LocalDateTime.now());}

    @PostMapping("postMoonCycle")
    public String postMoonCycle(LocalDateTime date){ return getMoonCl(date);}

    public String getMoonCl(LocalDateTime ldt){
        int Day = ldt.getDayOfMonth();
        if(Day<=6) return "Waxing Crescent";
        else if(Day==7) return "Full Moon";
        else if(Day>7 && Day<=14) return "Waning Moon";
        else if(Day==15) return "Last Muarter";
        else if(Day>15 && Day<=20) return "Waning Month";
        else if(Day==21) return "New Moon";
        else if(Day>21 && Day<=27) return "Growing Month";
        else if(Day>27 && Day<30) return "First Quarter";
        else if(Day>=30) return "First Quarter";
        else return "Error";
    }
}
