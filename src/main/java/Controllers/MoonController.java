package Controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class MoonController {
    @GetMapping("getMoonCycle")
    public String getMoonCycle(){
        LocalDateTime now = LocalDateTime.now();
        if(now.getDayOfMonth()<=6) return "Waxing Crescent";
        else if(now.getDayOfMonth()==7) return "Full moon";
        else if(now.getDayOfMonth()>7 && now.getDayOfMonth()<=14) return "Waning moon";
        else if(now.getDayOfMonth()>15) return "Last quarter";
        else if(now.getDayOfMonth()>15 && now.getDayOfMonth()<=20) return "Waning month";
        else if(now.getDayOfMonth()==21) return "New moon";
        else if(now.getDayOfMonth()>21 && now.getDayOfMonth()<=27) return "Growing month";
        else if(now.getDayOfMonth()>27 && now.getDayOfMonth()<30) return "First quarter";
        else if(now.getDayOfMonth()>=30) return "First quarter";
        else return "Error";
    }
    @PostMapping("postMoonCycle")
    public String postMoonCycle(LocalDateTime date){
        int Day = date.getDayOfMonth();
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
