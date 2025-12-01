# 测试应用启动脚本
Write-Host "正在检查端口占用情况..." -ForegroundColor Cyan

# 检查9090端口
$port9090 = netstat -ano | findstr :9090
if ($port9090) {
    Write-Host "警告: 端口 9090 已被占用" -ForegroundColor Red
    Write-Host $port9090
} else {
    Write-Host "端口 9090 可用" -ForegroundColor Green
}

# 检查9091端口（Actuator）
$port9091 = netstat -ano | findstr :9091
if ($port9091) {
    Write-Host "警告: 端口 9091 已被占用" -ForegroundColor Red
    Write-Host $port9091
} else {
    Write-Host "端口 9091 可用" -ForegroundColor Green
}

Write-Host "`n配置文件内容:" -ForegroundColor Cyan
Get-Content .\src\main\resources\application.properties | Select-String "server.port|spring.application.name"

Write-Host "`n准备启动应用..." -ForegroundColor Cyan
Write-Host "使用命令: mvn spring-boot:run" -ForegroundColor Yellow

