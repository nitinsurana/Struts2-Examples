<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<html>
    <head>
        <style type="text/css">
            font{font-size: 62.5%}
        </style>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <script type="text/javascript">
            function formatLink(cellvalue, options, row) {
                return "<a href='#' onClick='javascript:openDialog("+row.id+")'>" + cellvalue + "</a>";
            }
            function openDialog(id) {
                $("#iddialog").load("detailaction.action?id="+id);
                $("#iddialog").dialog('open');
            }
        </script>
    </head>
    <body>

        <sj:dialog
            id="iddialog"
            title="Person Details"
            autoOpen="false"
            modal="true"
            width="300"
            >
        </sj:dialog>

        <div align="center">
            <s:url id="remoteurl" action="gridfillaction"/>

            <sjg:grid id="sjgrid" dataType="json" href="%{remoteurl}"
                      navigator="true" viewrecords="true"
                      pager="true"
                      gridModel="gridModel"
                      width="600"
                      >
                <sjg:gridColumn name="id" formatter="integer" title="ID" key="true" align="center"/>
                <sjg:gridColumn name="name" title="Name" formatter="formatLink" align="center"
                                width="400"
                                formatoptions="{varhere : 'valuehere'}"
                                />
            </sjg:grid>
        </div>
    </body>
</html>