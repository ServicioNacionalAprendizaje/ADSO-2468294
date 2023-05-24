package com.sena.backedservice.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.backedservice.Dto.IPermissionDto;
import com.sena.backedservice.Entity.User;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

	@Query(value = " SELECT  "
					+ "	v.route viewRoute, "
					+ "    v.label viewLabel, "
					+ "    m.route moduleRoute, "
					+ "    m.label moduleLabel "
					+ "FROM  "
					+ "	user u  "
					+ "	INNER JOIN user_role ur ON ur.user_id = u.id "
					+ "    INNER JOIN role r ON r.id = ur.role_id "
					+ "    INNER JOIN view_role vr ON vr.role_id = r.id "
					+ "    INNER JOIN view v ON v.id = vr.view_id "
					+ "    INNER JOIN module m ON m.id = v.module_id "
					+ "WHERE  "
					+ "	u.user = :user  "
					+ "    AND u.password = :password "
					+ "    AND u.state = TRUE "
					+ "    AND r.state = TRUE "
					+ "    AND v.state = TRUE "
					+ "    AND m.state = TRUE "
					+ "    AND ur.state = TRUE "
					+ "    AND vr.state = TRUE ", nativeQuery = true)
			List<IPermissionDto> getPermission(String user, String password);
}
