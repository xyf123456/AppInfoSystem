<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="common/header.jsp" %>
<div class="clearfix"></div>
<div class="row">
    <div class="col-md-12 col-sm-12 col-xs-12">
        <div class="x_panel">
            <div class="x_title">
                <h2>新增APP基础信息 <i class="fa fa-user"></i>
                    <small>${devUserSession.devname}</small>
                </h2>
                <div class="clearfix"></div>
            </div>
            <div class="x_content">
                <!-- <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" ></label>
                         <div class="col-md-6 col-sm-6 col-xs-12">
                           <form action="uploadlogo" class="dropzone" style="height:100px;">
                           </form>
                      <div class="clearfix"></div>
                   </div>
                 </div> -->
                <div class="clearfix"></div>
                <form class="form-horizontal form-label-left" action="<%=request.getContextPath()%>/dev/flatform/app/appinfoaddsave" method="post"
                      enctype="multipart/form-data">
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwarename">软件名称 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="softwarename" class="form-control col-md-7 col-xs-12"
                                   data-validate-length-range="20" data-validate-words="1" name="softwarename"
                                   required="required"
                                   placeholder="请输入软件名称" type="text">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="apkname">APK名称 <span
                                class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="apkname" class="form-control col-md-7 col-xs-12"
                                   data-validate-length-range="20" data-validate-words="1" name="apkname"
                                   required="required"
                                   placeholder="请输入APK名称" type="text">
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="supportrom">支持ROM <span
                                class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="supportrom" class="form-control col-md-7 col-xs-12" name="supportrom"
                                   data-validate-length-range="20" data-validate-words="1" required="required"
                                   placeholder="请输入支持的ROM" type="text">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="interfacelanguage">界面语言 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="interfacelanguage" class="form-control col-md-7 col-xs-12"
                                   data-validate-length-range="20" data-validate-words="1" name="interfacelanguage"
                                   required="required"
                                   placeholder="请输入软件支持的界面语言" type="text">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="softwaresize">软件大小 <span
                                class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="number" id="softwaresize" name="softwaresize" required="required"
                                   onkeyup="value=value.replace(/[^\d]/g,'')"
                                   data-validate-minmax="10,500" placeholder="请输入软件大小，单位为Mb"
                                   class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="downloads">下载次数 <span
                                class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="number" id="downloads" name="downloads" required="required"
                                   data-validate-minmax="10,500" placeholder="请输入下载次数"
                                   class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="flatformid">所属平台 <span
                                class="required">*</span></label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="flatformid" id="flatformid" class="form-control" required="required"></select>
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="categorylevel1">一级分类 <span
                                class="required">*</span></label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="categorylevel1" id="categorylevel1" class="form-control"
                                    required="required"> </select>
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="categorylevel2">二级分类 <span
                                class="required">*</span></label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="categorylevel2" id="categorylevel2" class="form-control"
                                    required="required"></select>
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="categorylevel3">三级分类 <span
                                class="required">*</span></label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="categorylevel3" id="categorylevel3" class="form-control"
                                    required="required"></select>
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="status">APP状态 <span
                                class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="hidden" name="status" id="status" value="1">待审核
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="appinfo">应用简介 <span
                                class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
              <textarea id="appinfo" name="appinfo" required="required"
                        placeholder="请输入本软件的相关信息，本信息作为软件的详细信息进行软件的介绍。"
                        class="form-control col-md-7 col-xs-12"></textarea>
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="a_logoPicPath">LOGO图片 <span
                                class="required">*</span>
                        </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="file" class="form-control col-md-7 col-xs-12" name="a_logoPicPath"
                                       required="required" id="a_logoPicPath"/>
                                ${fileUploadError }
                        </div>
                    </div>
                    <div class="ln_solid"></div>
                    <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                            <button id="send" type="submit" class="btn btn-success">保存</button>
                            <button type="button" class="btn btn-primary" id="back">返回</button>
                            <br/><br/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<%@include file="common/footer.jsp" %>
<script src="${pageContext.request.contextPath }/statics/localjs/appinfoadd.js"></script>