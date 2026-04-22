package andreibri.u5_w3_d3.controllers;

import andreibri.u5_w3_d3.entities.InfoAdapter;
import andreibri.u5_w3_d3.interfaces.DataSource;
import andreibri.u5_w3_d3.model.Info;
import andreibri.u5_w3_d3.services.UserData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserData userData;

    public UserController(UserData userData) {
        this.userData = userData;
    }

    @PostMapping("/info")
    public Map<String, Object> getInfo(@RequestBody Info info) {
        DataSource adapter = new InfoAdapter(info);
        return userData.getData(adapter);
    }
}
