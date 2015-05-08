<%@ include file="/init.jsp" %>
<%
List<Group> groups = SitesUtil.getFavoriteSitesGroups(themeDisplay.getUserId(), null, 0, 20);
int groupsCount = SitesUtil.getFavoriteSitesGroupsCount(themeDisplay.getUserId(), null);

if (groupsCount == 0) {
	// get all
	groups = SitesUtil.getVisibleSites(themeDisplay.getCompanyId(), themeDisplay.getUserId(), null, true, 0, 20);
	groupsCount = SitesUtil.getVisibleSitesCount(themeDisplay.getCompanyId(), themeDisplay.getUserId(), null, true);
}
%>

<ul class="sites">
	<% for (Group siteToDisplay : groups) { %>

	<li class="site"><a href="<%= siteToDisplay.getPathFriendlyURL(!siteToDisplay.hasPublicLayouts(), themeDisplay) + siteToDisplay.getFriendlyURL()%>"><%= siteToDisplay.getDescriptiveName() %></a></li>
	<% } %>
</ul>