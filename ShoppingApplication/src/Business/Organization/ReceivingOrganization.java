/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ReceivingRole;
import java.util.ArrayList;

/**
 *
 * @author Tianyu
 */
public class ReceivingOrganization extends Organization {
    public ReceivingOrganization() {
        super(Organization.Type.Receiving.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceivingRole());
        return roles;
    }
}
