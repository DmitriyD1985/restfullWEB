package org.mycompany.Repository.service;

import org.mycompany.Repository.dao.UserDAO;
import org.mycompany.Repository.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserService {
        // URI:
        // /contextPath/servletPath/employees
        @GET
        @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
        public List<User> getEmployees_JSON() {
            List<User> listOfCountries = UserDAO.getAllEmployees();
            return listOfCountries;
        }

        // URI:
        // /contextPath/servletPath/employees/{empNo}
        @GET
        @Path("/{empNo}")
        @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
        public User getEmployee(@PathParam("empNo") String empNo) {
            return UserDAO.getEmployee(empNo);
        }

        // URI:
        // /contextPath/servletPath/employees
        @POST
        @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
        public User addEmployee(User emp) {
            return UserDAO.addEmployee(emp);
        }

        // URI:
        // /contextPath/servletPath/employees
        @PUT
        @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
        public User updateEmployee(User emp) {
            return UserDAO.updateEmployee(emp);
        }

        @DELETE
        @Path("/{empNo}")
        @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
        public void deleteEmployee(@PathParam("empNo") String empNo) {
            UserDAO.deleteEmployee(empNo);
        }

    }