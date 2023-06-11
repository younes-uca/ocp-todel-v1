package  ma.sir.ocp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.ocp.bean.core.*;
import ma.sir.ocp.service.facade.admin.*;

import ma.sir.ocp.zynerator.security.common.AuthoritiesConstants;
import ma.sir.ocp.zynerator.security.bean.User;
import ma.sir.ocp.zynerator.security.bean.Permission;
import ma.sir.ocp.zynerator.security.bean.Role;
import ma.sir.ocp.zynerator.security.service.facade.UserService;
import ma.sir.ocp.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.ocp.required.facade")
public class OcpApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(OcpApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Professeur.edit"));
        permissions.add(new Permission("Professeur.list"));
        permissions.add(new Permission("Professeur.view"));
        permissions.add(new Permission("Professeur.add"));
        permissions.add(new Permission("Professeur.delete"));
        permissions.add(new Permission("ClasseRoom.edit"));
        permissions.add(new Permission("ClasseRoom.list"));
        permissions.add(new Permission("ClasseRoom.view"));
        permissions.add(new Permission("ClasseRoom.add"));
        permissions.add(new Permission("ClasseRoom.delete"));
        permissions.add(new Permission("Niveau.edit"));
        permissions.add(new Permission("Niveau.list"));
        permissions.add(new Permission("Niveau.view"));
        permissions.add(new Permission("Niveau.add"));
        permissions.add(new Permission("Niveau.delete"));
        permissions.add(new Permission("Etudiant.edit"));
        permissions.add(new Permission("Etudiant.list"));
        permissions.add(new Permission("Etudiant.view"));
        permissions.add(new Permission("Etudiant.add"));
        permissions.add(new Permission("Etudiant.delete"));
        permissions.add(new Permission("Discipline.edit"));
        permissions.add(new Permission("Discipline.list"));
        permissions.add(new Permission("Discipline.view"));
        permissions.add(new Permission("Discipline.add"));
        permissions.add(new Permission("Discipline.delete"));
        permissions.add(new Permission("NoteDiscipline.edit"));
        permissions.add(new Permission("NoteDiscipline.list"));
        permissions.add(new Permission("NoteDiscipline.view"));
        permissions.add(new Permission("NoteDiscipline.add"));
        permissions.add(new Permission("NoteDiscipline.delete"));
        permissions.add(new Permission("NoteMatiere.edit"));
        permissions.add(new Permission("NoteMatiere.list"));
        permissions.add(new Permission("NoteMatiere.view"));
        permissions.add(new Permission("NoteMatiere.add"));
        permissions.add(new Permission("NoteMatiere.delete"));
        permissions.add(new Permission("Matiere.edit"));
        permissions.add(new Permission("Matiere.list"));
        permissions.add(new Permission("Matiere.view"));
        permissions.add(new Permission("Matiere.add"));
        permissions.add(new Permission("Matiere.delete"));
    }

}


