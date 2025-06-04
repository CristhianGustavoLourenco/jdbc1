/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbc1;

import db.DB;
import java.sql.Connection;

/**
 *
 * @author crist
 */
public class Jdbc1 {

    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnetion();
    }
}
