/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.DeliveryPlatformEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReceivingRole.ReceivingWorkAreaJPanel;


/**
 *
 * @author Kaushik
 */
public class ReceivingRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EnterpriseDirectory enterpriseDirectory, EcoSystem business) {
        return new ReceivingWorkAreaJPanel(userProcessContainer, organization, account, (DeliveryPlatformEnterprise)enterprise);
    }
    
}
