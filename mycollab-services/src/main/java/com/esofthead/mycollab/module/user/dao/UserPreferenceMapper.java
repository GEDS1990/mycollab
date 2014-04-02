/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.user.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.user.domain.UserPreference;
import com.esofthead.mycollab.module.user.domain.UserPreferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPreferenceMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int countByExample(UserPreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int deleteByExample(UserPreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int insert(UserPreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int insertSelective(UserPreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    List<UserPreference> selectByExample(UserPreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    UserPreference selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int updateByExampleSelective(@Param("record") UserPreference record, @Param("example") UserPreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int updateByExample(@Param("record") UserPreference record, @Param("example") UserPreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int updateByPrimaryKeySelective(UserPreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    Integer insertAndReturnKey(UserPreference value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_preference
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    void massUpdateWithSession(@Param("record") UserPreference record, @Param("primaryKeys") List primaryKeys);
}