/**
 * Provides the class model and repository model with basic fields and methods for the Admin entity.
 * Basic fields like first name and last name are stored in the parent table 'person'.
 * In the 'Admin' table, only the id from the 'person' table is stored, indicating who from the 'person' table is also an admin.
 * This approach is used to maintain data consistency.
 *
 * <p>This package contains:
 * <ul>
 *   <li>{@link com.Januszex.Warehuse.JPA.Admin.Admin} - Entity class representing an admin user.</li>
 *   <li>{@link com.Januszex.Warehuse.JPA.Admin.AdminRepo} - Repository interface containing methods for handling logic related to the 'Admin' table.</li>
 * </ul>
 */
package com.Januszex.Warehuse.JPA.Admin;