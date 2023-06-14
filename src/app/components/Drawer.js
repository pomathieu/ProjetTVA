"use client";
import * as React from 'react';
import { useEffect } from 'react';
import { styled, useTheme } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import CssBaseline from '@mui/material/CssBaseline';
import List from '@mui/material/List';
import Divider from '@mui/material/Divider';
import IconButton from '@mui/material/IconButton';
import ChevronLeftIcon from '@mui/icons-material/ChevronLeft';
import ChevronRightIcon from '@mui/icons-material/ChevronRight';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import DashboardRoundedIcon from '@mui/icons-material/DashboardRounded';
import FolderSpecialRoundedIcon from '@mui/icons-material/FolderSpecialRounded';
import ReceiptRoundedIcon from '@mui/icons-material/ReceiptRounded';
import ExpandLessIcon from '@mui/icons-material/ExpandLess';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import Collapse from '@mui/material/Collapse';
import MenuAppBar from './MenuAppBar';
import Link from 'next/link';

const drawerWidth = 270;

const DrawerHeader = styled('div')(({ theme }) => ({
  display: 'flex',
  alignItems: 'center',
  padding: theme.spacing(0, 1),
  // necessary for content to be below app bar
  ...theme.mixins.toolbar,
  justifyContent: 'flex-end',
}));

export default function PersistentDrawerLeft() {
  const theme = useTheme();
  const [open, setOpen] = React.useState(false);
  const [declarationOpen, setDeclarationOpen] = React.useState(false);

  const handleDrawerOpen = () => {
    setOpen(true);
  };

  const handleDrawerClose = () => {
    setOpen(false);
  };

  const handleDeclarationClick = () => {
    setDeclarationOpen(!declarationOpen);
  };

  useEffect(() => {
    if (typeof document !== "undefined") {
      const body = document.getElementById("body");
      if (body) {
        body.style.marginLeft = open ? `${drawerWidth}px` : "0px";
      }
    }
  }, [open]);

  return (
    <Box sx={{ display: 'flex' }}>
      <CssBaseline />
      <MenuAppBar handleDrawerOpen={handleDrawerOpen} open={open}/>
      <Drawer
        sx={{
          width: drawerWidth,
          flexShrink: 0,
          '& .MuiDrawer-paper': {
            width: drawerWidth,
            boxSizing: 'border-box',
          },
        }}
        variant="persistent"
        anchor="left"
        open={open}
      >
        <DrawerHeader>
          <IconButton onClick={handleDrawerClose}>
            {theme.direction === 'ltr' ? <ChevronLeftIcon /> : <ChevronRightIcon />}
          </IconButton>
        </DrawerHeader>
        <Divider />
        <List>
          {['Dashboard', 'Déclaration', 'Facturation'].map((text, index) => (
                
            <React.Fragment key={text}>
              {text === 'Dashboard' ? (
                <ListItem key={text} disablePadding>
                  <ListItemButton component={Link} href="/">
                    <ListItemIcon>
                      <DashboardRoundedIcon />
                    </ListItemIcon>
                    <ListItemText primary={text} />
                  </ListItemButton>
                </ListItem>
              ) : 
              
              text === 'Déclaration' ? (
                <React.Fragment>
                  <ListItem disablePadding onClick={handleDeclarationClick}>
                    <ListItemButton>
                      <ListItemIcon>
                        <FolderSpecialRoundedIcon />
                      </ListItemIcon>
                      <ListItemText primary="Déclaration" />
                      {declarationOpen ? <ExpandLessIcon /> : <ExpandMoreIcon />}
                    </ListItemButton>
                  </ListItem>
                  <Collapse in={declarationOpen} timeout="auto" unmountOnExit>
                    <List component="div" disablePadding>
                      <ListItem disablePadding>
                        <ListItemButton component={Link} href='/declaration/IE415' >
                          <ListItemIcon>
                            {/* Icône pour le sous-menu */}
                          </ListItemIcon>
                          <ListItemText primary="Créer une déclaration" />
                        </ListItemButton>
                      </ListItem>
                      <ListItem disablePadding>
                        <ListItemButton>
                          <ListItemIcon>
                            {/* Icône pour le sous-menu */}
                          </ListItemIcon>
                          <ListItemText primary="Modifier un brouillon" />
                        </ListItemButton>
                      </ListItem>
                      <ListItem disablePadding>
                        <ListItemButton>
                          <ListItemIcon>
                            {/* Icône pour le sous-menu */}
                          </ListItemIcon>
                          <ListItemText primary="Envoyer une déclaration" />
                        </ListItemButton>
                      </ListItem>
                    </List>
                  </Collapse>
                </React.Fragment>
              ) : (
                <ListItem key={text} disablePadding>
                  <ListItemButton>
                    <ListItemIcon>
                      {
                        (() => {
                          switch (index) {
                            case 2:
                              return <ReceiptRoundedIcon />;
                            default:
                              return null;
                          }
                        })()
                      }
                    </ListItemIcon>
                    <ListItemText primary={text} />
                  </ListItemButton>
                </ListItem>
              )}
            </React.Fragment>
          ))}
        </List>
        <Divider />
      </Drawer>
      </Box>
  );
}
