/*******************************************************************************
 * Copyright 2014 Cedric Longo.
 *
 * This file is part of Wall-T program.
 *
 * Wall-T is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Wall-T is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Wall-T.
 * If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package utils.teamcity.wallt.model.configuration;

import com.google.gson.annotations.SerializedName;

/**
 * Date: 16/02/14
 *
 * @author Cedric Longo
 */
public final class SavedBuildTypeData {

    @SerializedName( "id" )
    private String _id;

    @SerializedName( "name" )
    private String _name;

    @SerializedName( "projectName" )
    private String _projectName;

    @SerializedName( "projectId" )
    private String _projectId;

    @SerializedName( "alias_name" )
    private String _aliasName;

    public SavedBuildTypeData( final String id, final String name, final String projectId, final String projectName, final String aliasName ) {
        _id = id;
        _name = name;
        _projectId = projectId;
        _projectName = projectName;
        _aliasName = aliasName;
    }

    public String getId( ) {
        return _id;
    }

    public String getName( ) {
        return _name;
    }

    public String getProjectId( ) {
        return _projectId;
    }

    public String getProjectName( ) {
        return _projectName;
    }

    public String getAliasName( ) {
        return _aliasName;
    }
}
