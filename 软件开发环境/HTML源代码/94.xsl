<?xml version="1.0" encoding="GB2312"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
  <xsl:template match="/">
    <html>
      <body>



          <xsl:for-each select="联系人列表/联系人">
            <td><xsl:value-of select="姓名"/></td>
            <td><xsl:value-of select="电话"/></td>
</xsl:for-each>
   </body>
    </html>
       
