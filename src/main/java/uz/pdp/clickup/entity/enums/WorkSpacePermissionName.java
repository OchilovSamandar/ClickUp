package uz.pdp.clickup.entity.enums;

import java.util.Arrays;
import java.util.List;

public enum WorkSpacePermissionName {
    CAN_ADD_MEMBER("Add/Remove Members",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_REMOVE_STATUS("CAN_REMOVE_STATUS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_EDIT_WORKSPACE("CAN_EDIT_STATUS",
                              "Gives user permission to add or remove members to the  Workspace",
                      Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_ADD_GUEST("CAN_ADD_GUEST",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_SEE_TIME_ESTIMATED("CAN_SEE_TIME_ESTIMATED",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_SEE_TIME_SPENT("CAN_SEE_TIME_SPEND",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_CREATE_SPACES("CAN_CREATE_SPACES",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_CREATE_LISTS("CAN_CREATED_LISTS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_DELETE_COMMENTS("CAN_DELETE_COMMENTS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_DELETE_ITEMS("CAN_DELETE_ITEMS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_EDIT_DESCRIPTION("CAN_EDIT_DESCRIPTION",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_ADD_LIST_STATUSES("CAN_ADD_LIST_STATUSES",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_EDIT_TEAM("CAN_EDIT_TEAM",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_EXPORT_TASKS("CAN_EXPORT_TASKS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_EDIT_TEAM_OWNER("CAN_EDIT_TEAM_OWNER",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN,WorkSpaceRoleName.ROLE_MEMBER)),

    CAN_SHARE("CAN_SHARE",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_MANAGE_TAGS("CAN_MANAGE_TAGS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER, WorkSpaceRoleName.ROLE_ADMIN, WorkSpaceRoleName.ROLE_MEMBER)),

    CAN_MANAGE_STATUSES("CAN_MANAGE_STATUSES",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_SEE_TEAM_MEMBERS("CAN_SEE_TEAM_MEMBERS",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_ADD_ROLE("CAN_ADD_ROLE",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN)),

    CAN_CHANGE_PERMISSION("CAN_CHANGE_PERMISSION",
            "Gives user permission to add or remove members to the  Workspace",
            Arrays.asList(WorkSpaceRoleName.ROLE_OWNER,WorkSpaceRoleName.ROLE_ADMIN));

    public String name;
    public String description;
    public List<WorkSpaceRoleName> workSpaceRoleNames;

    WorkSpacePermissionName(String name, String description,List<WorkSpaceRoleName> workSpaceRoleNames) {
        this.name = name;
        this.description = description;
        this.workSpaceRoleNames=workSpaceRoleNames;
    }
}
